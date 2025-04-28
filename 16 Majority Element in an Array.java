import java.util.HashMap;

public class Question16 {
    public static int majorityElement(int[] suheb1) {
        HashMap<Integer, Integer> suheb2 = new HashMap<>();
        int suheb3 = suheb1.length / 2;

        for (int i : suheb1) {
            suheb2.put(i, suheb2.getOrDefault(i, 0) + 1);
            if (suheb2.get(i) > suheb3) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] suheb1 = {3, 2, 3};
        System.out.println("Majority element: " + majorityElement(suheb1));
    }
}
