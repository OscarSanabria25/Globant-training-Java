package MusicShop.Factory;

import MusicShop.batery.Batery1;
import MusicShop.batery.Batery2;
import MusicShop.batery.IBatery;
import MusicShop.capacity.Capacity1;
import MusicShop.capacity.Capacity2;
import MusicShop.capacity.Icapacity;
import MusicShop.color.Color1;
import MusicShop.color.Color2;
import MusicShop.color.IColor;

public class Offer2 implements PlayMusicfactory{
    @Override
    public IBatery choiseBatery() {
        return new Batery2();
    }

    @Override
    public Icapacity choiceCapacity() {
        return new Capacity2();
    }

    @Override
    public IColor choiseColor() {
        return new Color2();
    }
}
