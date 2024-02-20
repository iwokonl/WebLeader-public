package Models;

import java.util.HashSet;
import java.util.Set;

public class OnlineStoreItem {

    private String itemName;
    private int stock;
    private Set<Observer> observers;

    public OnlineStoreItem(String itemName, int stock){
        this.itemName = itemName;
        this.stock = stock;
        this.observers = new HashSet<>();
    }

    public void subscribe(Observer observer){
        observers.add(observer);
    }

    public void unsubscribe(Observer observer){
        observers.remove(observer);
    }

    public void updateStock(int newStock){
        int oldStock = this.stock;
        this.stock = newStock;

        if(oldStock == 0 && this.stock > 0)
            for(Observer observer : observers) observer.notify(this.itemName);
    }

    /*
    public void updateStock(int newStock) {
        if(this.stock == 0 && newStock > 0)
            for(Observer observer : observers) observer.notify(this.itemName);
        this.stock = newStock;
    }
    nie robimy tak, zeby nie bylo bledow w logice, poniewaz chcemy powiadamiac
    obserwator dopiero, gdy wartosc zostanie zmieniona, w tym przypadku powiadamiamy
    przed przypisanie nowej wartosci do zmiennej stock
    */

}
