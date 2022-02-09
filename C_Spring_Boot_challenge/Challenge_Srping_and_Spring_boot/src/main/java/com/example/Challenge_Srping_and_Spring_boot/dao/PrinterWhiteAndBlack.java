package com.example.Challenge_Srping_and_Spring_boot.dao;

import org.springframework.stereotype.Repository;

@Repository
public class PrinterWhiteAndBlack implements IPinter{
    @Override
    public String choisePrint() {
        System.out.println("you choised a printer white and black");
        return null;
    }
}
