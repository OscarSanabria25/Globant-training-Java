package MusicShop.Factory;

import MusicShop.batery.Batery1;
import MusicShop.batery.IBatery;
import MusicShop.capacity.Capacity1;
import MusicShop.capacity.Icapacity;
import MusicShop.color.Color1;
import MusicShop.color.IColor;

public class Offer1 implements PlayMusicfactory{
    @Override
    public IBatery choiseBatery() {
        return new Batery1();
    }

    @Override
    public Icapacity choiceCapacity() {
        return new Capacity1();
    }

    @Override
    public IColor choiseColor() {
        return new Color1();
    }
}
