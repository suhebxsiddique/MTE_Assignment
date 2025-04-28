public class Question29 {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int suheb1 = 0, suheb2 = x;
        while (suheb2 != 0) {
            suheb1 = suheb1 * 10 + suheb2 % 10;
            suheb2 /= 10;
        }
        return x == suheb1;
    }

    public static void main(String[] args) {
        System.out.println("Is palindrome: " + isPalindrome(121));
    }
}
