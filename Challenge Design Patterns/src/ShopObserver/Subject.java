package ShopObserver;

public interface Subject {
    public void subscribe(Observer o);
    public void insubscribe(Observer o);
    public void notifyObserver();

}
