public class Question17 {
    public static int trap(int[] suheb1) {
        int n = suheb1.length;
        int[] suheb2 = new int[n];
        int[] suheb3 = new int[n];
        int suheb4 = 0;

        suheb2[0] = suheb1[0];
        suheb3[n - 1] = suheb1[n - 1];

        for (int i = 1; i < n; i++) {
            suheb2[i] = Math.max(suheb2[i - 1], suheb1[i]);
        }

        for (int i = n - 2; i >= 0; i--) {
            suheb3[i] = Math.max(suheb3[i + 1], suheb1[i]);
        }

        for (int i = 0; i < n; i++) {
            suheb4 += Math.min(suheb2[i], suheb3[i]) - suheb1[i];
        }

        return suheb4;
    }

    public static void main(String[] args) {
        int[] suheb1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Water trapped: " + trap(suheb1));
    }
}
