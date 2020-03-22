package io.hawt.example.spring.boot.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ExampleRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("timer:tick")
            .routeId("test-timer-route")
            .log("Hello Camel!");
    }
}
