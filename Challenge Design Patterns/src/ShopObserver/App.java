package ShopObserver;

public class App {
    public static void main(String[] args) {
        Cliente product1=new Cliente();
        ShopPage s=new ShopPage();
        ShopPage s2=new ShopPage();
        ShopPage s3=new ShopPage();

        s.subscribe(product1);
        System.out.println("______________________________");
        System.out.println("Se ha cambiado el precio del producto");
        s.setPrice(2000);
        System.out.println("---------separando metodos---------");

        s.insubscribe(product1);

    }
}
