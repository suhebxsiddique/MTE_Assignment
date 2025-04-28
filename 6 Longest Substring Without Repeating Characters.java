public class Question6 {
    public static void main(String[] args) {
        String suheb1 = "abcabcbb";
        int suheb2 = 0, maxLength = 0;
        java.util.HashSet<Character> suheb3 = new java.util.HashSet<>();

        for (int i = 0; i < suheb1.length(); i++) {
            while (suheb3.contains(suheb1.charAt(i))) {
                suheb3.remove(suheb1.charAt(suheb2));
                suheb2++;
            }
            suheb3.add(suheb1.charAt(i));
            maxLength = Math.max(maxLength, i - suheb2 + 1);
        }

        System.out.println("Length of longest substring: " + maxLength);
    }
}
