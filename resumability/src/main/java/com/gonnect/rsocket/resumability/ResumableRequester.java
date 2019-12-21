package com.gonnect.rsocket.resumability;

import io.rsocket.RSocket;
import io.rsocket.RSocketFactory;
import io.rsocket.transport.netty.client.TcpClientTransport;
import io.rsocket.util.DefaultPayload;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ResumableRequester {

    private static final int CLIENT_PORT = 7001;

    public static void main(String[] args) {
        RSocket socket = RSocketFactory.connect()
                .resume()
                .resumeSessionDuration(ResumableResponder.RESUME_SESSION_DURATION)
                .transport(TcpClientTransport.create(ResumableResponder.HOST, CLIENT_PORT))
                .start()
                .block();
        socket.requestStream(DefaultPayload.create("dummy"))
                .map(payload -> {
                    log.info("Received data: [{}]", payload.getDataUtf8());
                    return payload;
                })
                .blockLast();

    }
}
