public class Question8 {
    public static void main(String[] args) {
        String suheb1 = "babad";
        String suheb2 = "";
        for (int i = 0; i < suheb1.length(); i++) {
            for (int j = i; j < suheb1.length(); j++) {
                String substring = suheb1.substring(i, j + 1);
                if (isPalindrome(substring) && substring.length() > suheb2.length()) {
                    suheb2 = substring;
                }
            }
        }

        System.out.println("Longest palindromic substring: " + suheb2);
    }

    public static boolean isPalindrome(String s) {
        int suheb1 = 0, suheb2 = s.length() - 1;
        while (suheb1 < suheb2) {
            if (s.charAt(suheb1) != s.charAt(suheb2)) {
                return false;
            }
            suheb1++;
            suheb2--;
        }
        return true;
    }
}
