package com.jay.spring.cloud.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * created by Jay on 2019/5/30
 */
@RestController
public class BookController
{

//    @Bean
//    public RouteLocator myRoutes(RouteLocatorBuilder builder)
//    {
//        return builder.routes().route(p-> p.path("/get")
//                                           .filters(f-> f.addRequestHeader("hello", "world"))
//                                     .uri("http://httpbin.org/get")
////                                     .uri("http://localhost:9004/hello-consumer")
//                                     ).build();
//    }

    @RequestMapping("/fallback")
    public String fallback() {
        return "hello, fallback.";
    }
}
