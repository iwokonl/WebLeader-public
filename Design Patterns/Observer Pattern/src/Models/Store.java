package Models;

public interface Store {
    void addCustomer(Customer customer);
    void removeCustomer(Customer customer);
    void notifyCustomers();
    void updateQuantity(int quantity);
}
