package com.beans;

import com.beans.Ejemplo1.Musician;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigInjection {
    @Bean
    public Musician musician(){
        return new Musician();

    }
}
