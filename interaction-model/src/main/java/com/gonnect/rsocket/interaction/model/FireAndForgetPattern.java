package com.gonnect.rsocket.interaction.model;

import io.rsocket.RSocket;
import io.rsocket.RSocketFactory;
import io.rsocket.transport.netty.client.TcpClientTransport;
import io.rsocket.util.DefaultPayload;

import static com.gonnect.rsocket.interaction.model.RSocketServer.HOST;
import static com.gonnect.rsocket.interaction.model.RSocketServer.PORT;

public class FireAndForgetPattern {

    public static void main(String[] args) {
        RSocket socket = RSocketFactory.connect()
                .transport(TcpClientTransport.create(HOST, PORT))
                .start()
                .block();

        socket.fireAndForget(DefaultPayload.create("Hello world!")).block();

    }

}
