public class Question23 {
    public static int findMaximumXOR(int[] suheb1) {
        int suheb2 = 0, suheb3 = 0;
        for (int i = 31; i >= 0; i--) {
            suheb2 <<= 1;
            suheb3 <<= 1;
            for (int num : suheb1) {
                if ((num & (1 << i)) != 0) {
                    suheb2 |= 1;
                }
            }
        }
        return suheb3;
    }

    public static void main(String[] args) {
        int[] suheb1 = {3, 10, 5, 25, 2, 8};
        System.out.println("Maximum XOR: " + findMaximumXOR(suheb1));
    }
}
