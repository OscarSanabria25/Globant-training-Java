package com.example.Challenge_Srping_and_Spring_boot.dao.controller;

import com.example.Challenge_Srping_and_Spring_boot.dao.NewPrinter;
import com.example.Challenge_Srping_and_Spring_boot.dao.PrinterColor;
import com.example.Challenge_Srping_and_Spring_boot.dao.PrinterWhiteAndBlack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrinterController {

    @Autowired
    private NewPrinter newPrinter;
    @Autowired
    private PrinterColor printerColor;
    @Autowired
    private PrinterWhiteAndBlack printerWhiteAndBlack;


    @GetMapping("/color")
    public  String choisePrintColor(){
        return printerColor.choisePrint();
    }

    @GetMapping("/bOrw")
    public  String choisePrintBOrW(){
        return printerWhiteAndBlack.choisePrint();
    }

        @PostMapping("/new")

    public void  addPrint(NewPrinter printer){
        newPrinter.addPrinter("hp pc");

    }
    @GetMapping("/new")
    public  String choiseNew(){
        return newPrinter.choisePrint();
    }
}
