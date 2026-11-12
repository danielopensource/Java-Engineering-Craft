
import java.util.HashMap;

/**
 * HashMapGet
 */
public class HashMapGet {

    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(101, "Daniel");
        students.put(102, "Denzil");
        students.put(103, "David");
        students.put(104, "Thomas");
        students.put(105, "Donal");
        students.put(106, "Navin");

        System.out.println(students.get(104)); // Thomas
        System.out.println(students.get(999)); // null
    }
}