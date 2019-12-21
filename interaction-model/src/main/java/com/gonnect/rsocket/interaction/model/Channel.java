package com.gonnect.rsocket.interaction.model;

import io.rsocket.RSocketFactory;
import io.rsocket.transport.netty.client.TcpClientTransport;
import io.rsocket.util.DefaultPayload;
import reactor.core.publisher.Flux;

import java.time.Duration;

public class Channel {

    public static void main(String[] args) {
        RSocketFactory.connect()
                .transport(TcpClientTransport.create(Server.HOST, Server.PORT))
                .start()
                .block()
                .requestChannel(Flux.interval(Duration.ofMillis(100))
                        .map(time -> DefaultPayload.create("Jenny")))
                .blockLast();
    }

}
