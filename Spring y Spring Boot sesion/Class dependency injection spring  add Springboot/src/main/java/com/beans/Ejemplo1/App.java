package com.beans.Ejemplo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
//        Musician musician= new Musician();
//        musician.getNombre();
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(AppConfig.class);
        Musician musician = (Musician) applicationContext.getBean("musician");
        musician.getNombre();
    }
}
