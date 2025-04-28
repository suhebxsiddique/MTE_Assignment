import java.util.*;

public class Question40 {
    public static int maxFrequencyElement(int[] suheb1) {
        Map<Integer, Integer> suheb2 = new HashMap<>();
        for (int num : suheb1) {
            suheb2.put(num, suheb2.getOrDefault(num, 0) + 1);
        }

        return Collections.max(suheb2.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public static void main(String[] args) {
        int[] suheb1 = {1, 2, 3, 2, 2, 3, 1};
        System.out.println("Maximum frequency element: " + maxFrequencyElement(suheb1));
    }
}
