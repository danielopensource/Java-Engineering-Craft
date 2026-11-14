
import java.util.HashMap;

/**
 * HashMapSize  
 */
public class HashMapSize {

    public static void main(String[] args) {
        HashMap<String, Integer> products = new HashMap<>();

        products.put("Laptop", 50000);
        products.put("Mouse", 700);
        products.put("Keyboard", 2600);
        products.put("Monitor", 16000);

        System.out.println("Number of products in cart: " + products.size()); // Number of products in cart: 4

        products.put("Laptop", 70000); // The existing value gets updated. A new entry isn't created

        System.out.println("Number of products in cart: " + products.size()); // Number of products in cart: 4

        // size() counts unique keys, not the number of times put() was called.
    }
}