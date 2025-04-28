public class Question18 {
    public static int findMaximumXOR(int[] suheb1) {
        int suheb2 = 0;
        int suheb3 = 0;

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
        int
