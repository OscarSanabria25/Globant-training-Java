package MusicShop2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("ingresa el color del producto azul o verde");
        String color= scanner.next();
        System.out.println("ingresa la capacidad en GBs producto 8 o 16");
        String capacity= scanner.next();
        System.out.println("ingresa la capacidad de bateria del producto 6 o 8");
        String batery= scanner.next();

        Product product= new ProducBuilder()

                .setColor(color)
                .setCapacity(capacity)
                .setBatery(batery)
                .build();

        System.out.println(Arrays.toString(new Product[]{product}));
    }
}
