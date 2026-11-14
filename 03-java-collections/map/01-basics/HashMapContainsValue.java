
import java.util.HashMap;

/**
 * HashMapContainsValue
 */
public class HashMapContainsValue {

    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();

        students.put("Daniel", 100);
        students.put("Dravid", 98);
        students.put("Franco", 87);
        students.put("John", 99);
        students.put("Rohith", 99);

        System.out.println(students.containsValue(99));

        if (students.containsValue(100)) {
            System.out.println("Student record has marks 100");

        } else {
            System.out.println("Student record doesn't have marks 100");

        }
    }
}