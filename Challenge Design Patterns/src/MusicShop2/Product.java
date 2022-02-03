package MusicShop2;

public class Product {
 private  String color;
 private int batery;
 private int capacity;

    public Product(String color, int batery, int capacity) {
        this.color = color;
        this.batery = batery;
        this.capacity = capacity;
    }

    public Product() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBatery() {
        return batery;
    }

    public void setBatery(int batery) {
        this.batery = batery;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "color='" + color + '\'' +
                ", batery=" + batery +
                ", capacity=" + capacity +
                '}';
    }
}
