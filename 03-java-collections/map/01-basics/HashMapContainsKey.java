
import java.util.HashMap;

/**
 * HashMapContainsKey
 */
public class HashMapContainsKey {

    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(101, "Daniel");
        students.put(102, "Denzil");
        students.put(103, "David");
        students.put(104, "Thomas");
        students.put(105, "Donal");
        students.put(106, "Navin");

        System.out.println(students.containsKey(101)); // true
        System.out.println(students.containsKey(999)); // false

        if (students.containsKey(107)) {
            System.out.println("Student present");
        } else {
            System.out.println("Student absent");
        }
    }
}