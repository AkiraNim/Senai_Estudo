package com.gilDaEsfiha.lanches.models.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfiguration {

    @Bean
    public String helloWorld() {
        return "Hello World";
    }
}
