public class Question19 {
    public static int maxProduct(int[] suheb1) {
        int suheb2 = suheb1[0], suheb3 = suheb1[0], suheb4 = suheb1[0];

        for (int i = 1; i < suheb1.length; i++) {
            if (suheb1[i] < 0) {
                int temp = suheb2;
                suheb2 = suheb3;
                suheb3 = temp;
            }

            suheb2 = Math.max(suheb1[i], suheb2 * suheb1[i]);
            suheb3 = Math.min(suheb1[i], suheb3 * suheb1[i]);

            suheb4 = Math.max(suheb4, suheb2);
        }

        return suheb4;
    }

    public static void main(String[] args) {
        int[] suheb1 = {2, 3, -2, 4};
        System.out.println("Maximum product subarray: " + maxProduct(suheb1));
    }
}
