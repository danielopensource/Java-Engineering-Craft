
import java.util.HashMap;

/**
 * HashMapPut
 */
public class HashMapPut {

    public static void main(String[] args) {
        // Example 1
        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Daniel", "1234567890");
        phoneBook.put("Michael", "0987654321");
        phoneBook.put("John", "4561237890");

        // Example 2
        HashMap<Integer, String> studentList = new HashMap<>();

        studentList.put(215, "Daniel");
        studentList.put(216, "Denzil");
        studentList.put(217, "David");
        studentList.put(218, "Donal");
        studentList.put(219, "Dravid");

        System.out.println(phoneBook);
        System.out.println(studentList);
    }
}