import java.util.*;

public class Question43 {
    public static List<Integer> topKFrequent(int[] suheb1, int k) {
        Map<Integer, Integer> suheb2 = new HashMap<>();
        for (int num : suheb1) {
            suheb2.put(num, suheb2.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> suheb3 = new PriorityQueue<>(
                (a, b) -> Integer.compare(b.getValue(), a.getValue()));

        suheb3.addAll(suheb2.entrySet());
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(suheb3.poll().getKey());
        }

        return result;
    }

    public static void main(String[] args) {
        int[] suheb1 = {1, 1, 1, 2, 2, 3};
        System.out.println("Top K frequent elements: " + topKFrequent(suheb1, 2));
    }
}
