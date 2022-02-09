package com.example.Challenge_Srping_and_Spring_boot.dao;

import com.example.Challenge_Srping_and_Spring_boot.model.Printer;
import org.springframework.stereotype.Repository;

@Repository
public class NewPrinter implements IPinter{
    public NewPrinter() {
    }

    @Override
    public String choisePrint() {
        System.out.println("you choised a printer new");
        return null;
    }

    public IPinter addPrinter(String nombre){

        Printer printer =new Printer();
        printer.setKindPrinter(nombre);
        System.out.println("you have created a new printer "+printer.getKindPrinter());

        return null;
    }
}
