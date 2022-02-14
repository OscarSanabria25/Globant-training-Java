package com.example.Challenge_Srping_and_Spring_boot;
import com.example.Challenge_Srping_and_Spring_boot.dao.IPinter;
import com.example.Challenge_Srping_and_Spring_boot.dao.NewPrinter;
import com.example.Challenge_Srping_and_Spring_boot.dao.PrinterColor;
import com.example.Challenge_Srping_and_Spring_boot.dao.PrinterWhiteAndBlack;
import com.example.Challenge_Srping_and_Spring_boot.model.Printer;

import java.util.Scanner;

public class Main {
    public Main() {
    }
    public static String n;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in );
        System.out.println("Select someone option");

        System.out.println("1. print color");
        System.out.println("2. print  b/w");
        System.out.println("3. create a new printer");
        System.out.println("0. exit");

        int print=scanner.nextInt();
        String prin =scanner.nextLine();
        switch (print){

            case 1:
                IPinter pinter=new PrinterColor();
                pinter.choisePrint();
                break;

            case 2:
                IPinter pinter2=new PrinterWhiteAndBlack();
                pinter2.choisePrint();
                break;
            case 3:


                if (print==3){
                    System.out.println("¿What printer do you want add?");
                    Printer printer=new Printer();
                     n=scanner.nextLine();
                    printer.setKindPrinter(n);
                }
                IPinter p=new NewPrinter().addPrinter(n);

                break;
            case 0:
                System.out.println("thanks for use the printers");
                break;
            default:
                System.out.println("insert un comand valid");

        }
    }
}
