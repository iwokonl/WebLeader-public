package Models.ModelsImpl;

import Models.Customer;
import Models.Store;

import java.util.HashSet;
import java.util.Set;

public class BookStore implements Store {

    private int stockQuantity;
    private Set<Customer> customers = new HashSet<>();
    @Override
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    @Override
    public void notifyCustomers() {
        for(Customer customer : customers) customer.update(stockQuantity);
    }

    @Override
    public void updateQuantity(int quantity) {
        int oldQuantity = this.stockQuantity;
        this.stockQuantity = quantity;
        if(oldQuantity == 0 && stockQuantity > 0) notifyCustomers();
    }
}
