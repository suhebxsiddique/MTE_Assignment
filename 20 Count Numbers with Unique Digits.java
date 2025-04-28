public class Question20 {
    public static int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        if (n == 1) return 10;

        int suheb1 = 9, suheb2 = 9, suheb3 = 9;

        for (int i = 2; i <= n; i++) {
            suheb1 *= (10 - i);
            suheb2 += suheb1;
        }

        return suheb2;
    }

    public static void main(String[] args) {
        System.out.println("Count of unique digits numbers: " + countNumbersWithUniqueDigits(2));
    }
}
