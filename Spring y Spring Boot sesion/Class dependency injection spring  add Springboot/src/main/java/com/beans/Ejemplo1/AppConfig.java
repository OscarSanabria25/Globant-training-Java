package com.beans.Ejemplo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Musician musician(){
        return new Musician();

    }
}
