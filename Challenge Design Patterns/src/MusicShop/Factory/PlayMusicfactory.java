package MusicShop.Factory;

import MusicShop.batery.IBatery;
import MusicShop.capacity.Icapacity;
import MusicShop.color.IColor;

public interface PlayMusicfactory {
    IBatery choiseBatery();
    Icapacity choiceCapacity();
    IColor choiseColor();
}
