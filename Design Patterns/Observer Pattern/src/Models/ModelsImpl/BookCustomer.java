package Models.ModelsImpl;

import Models.Customer;
import Models.Store;

public class BookCustomer implements Customer {

    private int observedStockQuantity;
    Store store;

    public BookCustomer(Store store){
        this.store = store;
        store.addCustomer(this);
    }

    @Override
    public void update(int stockQuantity){
        this.observedStockQuantity = stockQuantity;
        System.out.println("Hello, A book you are interested in is back in stock!");
    }
}
