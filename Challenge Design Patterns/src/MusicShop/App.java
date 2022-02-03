package MusicShop;


import MusicShop.Factory.Offer1;
import MusicShop.Factory.Offer2;
import MusicShop.Factory.PlayMusicfactory;
import MusicShop.batery.IBatery;
import MusicShop.capacity.Icapacity;
import MusicShop.color.IColor;

import java.util.Scanner;

public class App {
    private static int parameter;

    public static void main(String[] args) {

        PlayMusicfactory playMusicfactory= new Offer1() ;
        playMusicfactory.choiseBatery().choicebatery();
        playMusicfactory.choiceCapacity().choiceCapacity();
        playMusicfactory.choiseColor().choiceColor();

        PlayMusicfactory playMusicfactory2= new Offer2();
        playMusicfactory2.choiseBatery().choicebatery();

}
    }