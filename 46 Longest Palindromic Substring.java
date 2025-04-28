public class Question46 {
    public static String longestPalindrome(String suheb1) {
        if (suheb1 == null || suheb1.length() == 0) return "";
        int suheb2 = 0, suheb3 = 0;

        for (int i = 0; i < suheb1.length(); i++) {
            int len1 = expandAroundCenter(suheb1, i, i);
            int len2 = expandAroundCenter(suheb1, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > suheb3) {
                suheb2 = i - (len - 1) / 2;
                suheb3 = len;
            }
        }
        return suheb1.substring(suheb2, suheb2 + suheb3);
    }

    private static int expandAroundCenter(String suheb1, int left, int right) {
        while (left >= 0 && right < suheb1.length() && suheb1.charAt(left) == suheb1.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        System.out.println("Longest palindromic substring: " + longestPalindrome("babad"));
    }
}
