package com.gonnect.rsocket.spring;

import io.rsocket.RSocket;
import io.rsocket.RSocketFactory;
import io.rsocket.frame.decoder.PayloadDecoder;
import io.rsocket.transport.netty.client.TcpClientTransport;
import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.reactivestreams.Publisher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.messaging.rsocket.RSocketRequester;
import org.springframework.messaging.rsocket.RSocketStrategies;
import org.springframework.stereotype.Component;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.List;
import java.util.UUID;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

@Slf4j
@SpringBootApplication
public class RSocketRequesterApplication {


    public static void main(String[] args) {
        SpringApplication.run(RSocketRequesterApplication.class);
    }

    @Bean
    RSocket rSocket() {
        return RSocketFactory
                .connect()
                .frameDecoder(PayloadDecoder.ZERO_COPY)
                .dataMimeType(MimeTypeUtils.APPLICATION_JSON_VALUE)
                .transport(TcpClientTransport.create(7000))
                .start()
                .block();
    }

    @Bean
    RSocketRequester rSocketRequester(RSocket rSocket, RSocketStrategies rSocketStrategies) {
        return RSocketRequester.wrap(rSocket, MimeTypeUtils.APPLICATION_JSON,
                rSocketStrategies);
    }

    @RestController
    class PersonController {

        private final PersonServiceAdapter personServiceAdapter;


        PersonController (PersonServiceAdapter personServiceAdapter) {
            this.personServiceAdapter = personServiceAdapter;
        }

        @GetMapping("/p[ersons/{id}")
        Mono<PersonResponse> getCustomer(@PathVariable String id) {
            return personServiceAdapter.getPerson(id);
        }

        @GetMapping(value = "/persons", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
        Publisher<PersonResponse> getCustomers() {
            return personServiceAdapter.getPersons(getRandomIds(10));
        }

        @GetMapping(value = "/persons-channel", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
        Publisher<PersonResponse> getCustomersChannel() {
            return personServiceAdapter.getPersonChannel(Flux.interval(Duration.ofMillis(1000))
                    .map(id -> new PersonRequest(UUID.randomUUID().toString())));
        }

        private List<String> getRandomIds(int amount) {
            return IntStream.range(0, amount)
                    .mapToObj(n -> UUID.randomUUID().toString())
                    .collect(toList());
        }

    }

    @Component
    class PersonServiceAdapter {

        private final RSocketRequester rSocketRequester;

        PersonServiceAdapter(RSocketRequester rSocketRequester) {
            this.rSocketRequester = rSocketRequester;
        }

        Mono<PersonResponse> getPerson(String id) {
            return rSocketRequester
                    .route("customer")
                    .data(new PersonRequest(id))
                    .retrieveMono(PersonResponse.class)
                    .doOnNext(personResponse -> log.info("Received customer as mono [{}]", personResponse));
        }

        Flux<PersonResponse> getPersons(List<String> ids) {
            return rSocketRequester
                    .route("customer-stream")
                    .data(new MultiplePersonsRequest(ids))
                    .retrieveFlux(PersonResponse.class)
                    .doOnNext(personResponse -> log.info("Received customer as flux [{}]", personResponse));
        }

        Flux<PersonResponse> getPersonChannel(Flux<PersonRequest> customerRequestFlux) {
            return rSocketRequester
                    .route("customer-channel")
                    .data(customerRequestFlux, PersonRequest.class)
                    .retrieveFlux(PersonResponse.class)
                    .doOnNext(personResponse -> log.info("Received customer as flux [{}]", personResponse));
        }
    }

}
@Getter
@ToString
class PersonRequest {
    private String id;

    public PersonRequest() {
    }

    PersonRequest(String id) {
        this.id = id;
    }
}

@Getter
@ToString
class MultiplePersonsRequest {
    private List<String> ids;

    public MultiplePersonsRequest() {
    }

    MultiplePersonsRequest(List<String> ids) {
        this.ids = ids;
    }
}


@Getter
@ToString
class PersonResponse {

    private String id;

    private String name;

    public PersonResponse() {
    }

    PersonResponse(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
