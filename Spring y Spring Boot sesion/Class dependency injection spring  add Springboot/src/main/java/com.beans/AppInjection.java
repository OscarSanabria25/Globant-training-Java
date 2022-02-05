package com.beans;

import com.beans.Ejemplo1.AppConfig;
import com.beans.Ejemplo1.Musician;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInjection {
    public static void main(String[] args) {
//        Musician musician= new Musician();
//        musician.getNombre();
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(AppConfig.class);
        Musician musician = (Musician) applicationContext.getBean("musician");
        musician.getNombre();
    }
}
