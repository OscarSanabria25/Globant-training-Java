package ShopObserver;

public class App {
    public static void main(String[] args) {
        Product1 product1=new Product1();
        ShopPage s=new ShopPage();
        System.out.println("Se ha cambiado el nombre del producto");
       s.setName("televisor");
        System.out.println("______________________________");
        System.out.println("Se ha cambiado el precio del producto");
       s.setPrice(2000);

        System.out.println("---------separando metodos---------");
        s.subscribe(product1);
        s.insubscribe(product1);

    }
}
