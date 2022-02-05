package com.beans;


public class MusicianInjection {

    private  String nombre;

    private  Instrument instrument;

    public MusicianInjection(Guitar guitar) {
        this.instrument = guitar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public  void  playInstrument(){
        instrument.play();
    }
}
