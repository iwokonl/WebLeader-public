import Models.Customer;
import Models.ModelsImpl.BookCustomer;
import Models.ModelsImpl.BookStore;
import Models.Store;

public class Main {
    public static void main(String[] args){
        Store store = new BookStore();
        Customer customer1 = new BookCustomer(store);
        Customer customer2 = new BookCustomer(store);

        System.out.println("Setting stock to 0!");
        store.updateQuantity(0);
        System.out.println();
        
        System.out.println("Setting stock to 5!");
        store.updateQuantity(5);
        System.out.println();

        store.removeCustomer(customer1);
        store.updateQuantity(0);
        store.updateQuantity(5);
    }
}
