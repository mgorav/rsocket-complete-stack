package com.gonnect.rsocket.spring;


import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


@Slf4j
@SpringBootApplication
public class RSocketResponderApplication {


    public static void main(String[] args) {
        SpringApplication.run(RSocketResponderApplication.class);
    }

    @Controller
    public class PersonController {

        private final List<String> RANDOM_NAMES = Arrays.asList("Gaurav", "Aarika", "Naman", "Shikha", "Saurabh", "Shalu");

        @MessageMapping("persons")
        PersonResponse getPerson(PersonRequest personRequest) {
            return new PersonResponse(personRequest.getId(), getRandomName());
        }

        @MessageMapping("persons-stream")
        Flux<PersonResponse> getPersons(MultiplePersonsRequest multiplePersonsRequest) {
            return Flux.range(0, multiplePersonsRequest.getIds().size())
                    .delayElements(Duration.ofMillis(500))
                    .map(i -> new PersonResponse(multiplePersonsRequest.getIds().get(i), getRandomName()));
        }

        @MessageMapping("persons-channel")
        Flux<PersonResponse> getCustomersChannel(Flux<PersonRequest> requests) {
            return Flux.from(requests)
                    .doOnNext(message -> log.info("Received 'personChannel' request [{}]", message))
                    .map(message -> new PersonResponse(message.getId(), getRandomName()));
        }

        private String getRandomName() {
            return RANDOM_NAMES.get(new Random().nextInt(RANDOM_NAMES.size() - 1));
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
