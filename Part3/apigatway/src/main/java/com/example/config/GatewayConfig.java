package com.example.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("servicea", r -> r.path("/servicea/**")
                        .uri("http://localhost:8081")) 
                .route("serviceb", r -> r.path("/serviceb/**")
                        .uri("http://localhost:8082")) 
                .build();
    }
}
