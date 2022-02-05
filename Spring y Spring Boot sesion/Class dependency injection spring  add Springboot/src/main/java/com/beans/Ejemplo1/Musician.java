package com.beans.Ejemplo1;

import org.springframework.beans.factory.annotation.Value;

public class Musician {

    public  String nombre;
@Value("juan daza")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
