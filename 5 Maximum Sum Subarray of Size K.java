public class Question5 {
    public static void main(String[] args) {
        int[] suheb1 = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int suheb2 = 0, maxSum = 0;

        for (int i = 0; i < k; i++) {
            suheb2 += suheb1[i];
        }

        maxSum = suheb2;

        for (int i = k; i < suheb1.length; i++) {
            suheb2 += suheb1[i] - suheb1[i - k];
            maxSum = Math.max(maxSum, suheb2);
        }

        System.out.println("Maximum sum of subarray of size " + k + " is: " + maxSum);
    }
}
