
import java.util.HashMap;
import java.util.Map;

/**
 * HashMapFrequencyCounter
 */
public class HashMapFrequencyCounter {

    public static void main(String[] args) {
        System.out.println("HashMapBasics");
        int[] arr = { 2, 3, 4, 5, 5 };
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequency :" + freq);

    }
}