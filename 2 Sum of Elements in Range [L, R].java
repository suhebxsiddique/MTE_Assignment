public class Question2 {
    public static void main(String[] args) {
        int[] suheb1 = {1, 2, 3, 4, 5};
        int[] suheb2 = new int[suheb1.length];
        suheb2[0] = suheb1[0];

        for (int i = 1; i < suheb1.length; i++) {
            suheb2[i] = suheb2[i - 1] + suheb1[i];
        }

        int L = 1, R = 3;  // Example range
        int sum = (L > 0) ? suheb2[R] - suheb2[L - 1] : suheb2[R];
        System.out.println("Sum of range [" + L + ", " + R + "] is: " + sum);
    }
}
