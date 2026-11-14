
import java.util.HashMap;

/**
 * HashMapRemove
 */
public class HashMapRemove {

    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();

        employees.put(101, "Rahul");
        employees.put(102, "John");
        employees.put(103, "Donal");

        System.out.println(employees); // {101=Rahul, 102=John, 103=Donal}

        employees.remove(101); // Version 1

        System.out.println(employees); // {102=John, 103=Donal}

        employees.remove(102, "John"); // Version 2

        System.out.println(employees); // {103=Donal}

        employees.put(104, "Joy");

        String removedItem = employees.remove(104);

        System.out.println(removedItem); // Joy

    }
}