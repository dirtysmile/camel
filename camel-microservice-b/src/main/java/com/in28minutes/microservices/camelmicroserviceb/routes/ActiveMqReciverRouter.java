package com.in28minutes.microservices.camelmicroserviceb.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqReciverRouter extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("activemq:my-acitivemq-queue")
                .log("${body}")
        .to("log:received-message-from-active-mq");

    }
}

