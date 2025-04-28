import java.util.HashMap;

public class Question34 {
    public static boolean subarraySum(int[] suheb1, int k) {
        HashMap<Integer, Integer> suheb2 = new HashMap<>();
        suheb2.put(0, 1);

        int suheb3 = 0;
        for (int suheb4 : suheb1) {
            suheb3 += suheb4;
            if (suheb2.containsKey(suheb3 - k)) {
                return true;
            }
            suheb2.put(suheb3, 1);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] suheb1 = {23, 2, 4, 6, 7};
        System.out.println("Subarray sum equal to K: " + subarraySum(suheb1, 6));
    }
}
