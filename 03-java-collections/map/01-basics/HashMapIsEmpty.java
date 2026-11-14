
import java.util.HashMap;

/**
 * HashMapIsEmpty
 */
public class HashMapIsEmpty {

    public static void main(String[] args) {
        HashMap<String, Integer> products = new HashMap<>();

        System.out.println(products.isEmpty()); // true

        products.put("India", 100);
        products.put("Pakistan", 102);

        System.out.println(products.isEmpty()); // false

        if (products.isEmpty()) {
            System.out.println("Your cart is empty.");

        } else {
            System.out.println("Your cart contains " + products.size() + products);
        }

    }
}