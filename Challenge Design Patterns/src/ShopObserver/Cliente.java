package ShopObserver;

public class Cliente implements Observer {
    private int price;
    private String name;

    public Cliente() {
    }

    @Override
    public void update(int price, String name) {
       this.price=price;
       this.name=name;

        System.out.println(" se ha actualizado los campos");
    }
}
