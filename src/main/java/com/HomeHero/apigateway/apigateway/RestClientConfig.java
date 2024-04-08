package com.HomeHero.apigateway.apigateway;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestClientConfig {
    @Bean
    public RestClient.Builder restClientBuilder(){
        return RestClient.builder(new RestTemplate());
    }
}
