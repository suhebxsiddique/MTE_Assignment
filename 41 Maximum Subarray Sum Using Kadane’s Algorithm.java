public class Question41 {
    public static int maxSubArray(int[] suheb1) {
        int suheb2 = suheb1[0], suheb3 = suheb1[0];

        for (int i = 1; i < suheb1.length; i++) {
            suheb2 = Math.max(suheb1[i], suheb2 + suheb1[i]);
            suheb3 = Math.max(suheb3, suheb2);
        }

        return suheb3;
    }

    public static void main(String[] args) {
        int[] suheb1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum subarray sum: " + maxSubArray(suheb1));
    }
}
