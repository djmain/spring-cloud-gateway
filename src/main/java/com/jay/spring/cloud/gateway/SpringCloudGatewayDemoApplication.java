package com.jay.spring.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudGatewayDemoApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SpringCloudGatewayDemoApplication.class, args);
    }

//    @Bean
//    public RouteLocator myRoutes2(RouteLocatorBuilder builder)
//    {
//        String httpUri1 = "http://order-service/order/*";
//        String httpUri2 = "http://pay-service/pay/*";
//        return builder.routes()
//                      .route(p -> p
//                              .path("/order/*")
//                              .filters(f -> f.addRequestHeader("Hello", "World"))
//                              .uri(httpUri1))
//                      .route(p -> p
//                              .host("/pay/*")
//                              .uri(httpUri2))
//                      .build();
//    }


}





















