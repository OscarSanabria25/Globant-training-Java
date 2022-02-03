package ShopObserver;

public class Product1 implements Observer {
    public Product1() {
    }

    @Override
    public void update(int price, String name) {
        price=2000;
        name="pc";
        System.out.println("el precio es"+name+" y en nombre es"+price);
    }
}
