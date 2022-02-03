package ShopObserver;

import java.util.ArrayList;

public class ShopPage implements Subject{
    private ArrayList<Observer> observers;

    private int price;
    private String name;

    public ShopPage() {

        observers=new ArrayList<Observer>();
    }

    @Override
    public void subscribe(Observer o) {
    observers.add(o);
        System.out.println("Se ha subscrito ");
    }

    @Override
    public void insubscribe(Observer o) {
    observers.remove(o);
        System.out.println("Se ha cancela la subscripcion ");
    }

    public void setPrice(int p){
        this.price= p;
        notifyObserver();
    }



    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(1200, name);
        }

        System.out.println("ha llegado una notificación");
    }


}
