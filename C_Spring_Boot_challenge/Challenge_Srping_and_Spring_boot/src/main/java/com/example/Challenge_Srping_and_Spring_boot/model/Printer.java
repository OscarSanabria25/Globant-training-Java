package com.example.Challenge_Srping_and_Spring_boot.model;

import jdk.jshell.Snippet;

public class Printer {

    private int id;
    private String KindPrinter;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKindPrinter() {
        return KindPrinter;
    }

    public void setKindPrinter(String kindPrinter) {
        KindPrinter = kindPrinter;
    }

    public Printer(int i, String hp_printer) {
    }

    public Printer() {

    }

    @Override
    public String toString() {
        return "Printer{" +
                "id=" + id +
                ", KindPrinter='" + KindPrinter + '\'' +
                '}';
    }
}
