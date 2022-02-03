package MusicShop2;

import java.util.List;

public class ProducBuilder {

    private  String color="";
    private int batery=0;
    private int capacity=0;

    public ProducBuilder setColor(String color) {
        this.color = color;
        return this;
    }
    public ProducBuilder setCapacity(String batery) {
        this.batery = Integer.parseInt(batery);
        return this;
    }
    public ProducBuilder setBatery(String batery) {
        this.batery = Integer.parseInt(batery);
        return this;
    }
    public Product build() {
        return new Product(color,batery, batery);

    }

}