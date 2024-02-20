package Models.ModelsImpl;

import Models.Observer;

public class Customer implements Observer {

    private String name;

    public Customer(String name){
        this.name = name;
    }

    @Override
    public void notify(String itemName) {
        System.out.println("Item: " + itemName + " is back in stock!");
    }

}
