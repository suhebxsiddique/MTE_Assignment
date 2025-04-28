public class Question21 {
    public static int countOnes(int n) {
        int suheb1 = 0;
        while (n != 0) {
            suheb1 += n & 1;
            n >>= 1;
        }
        return suheb1;
    }

    public static void main(String[] args) {
        System.out.println("Number of 1s: " + countOnes(5));  // Binary 101 has 2 ones
    }
}
