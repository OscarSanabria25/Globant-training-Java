package com.beans;

public class Guitar implements Instrument {

    @Override
    public void play() {
        System.out.println("guitar sound");
    }
}
