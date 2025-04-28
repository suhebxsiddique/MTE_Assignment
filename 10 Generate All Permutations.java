public class Question10 {
    public static void main(String[] args) {
        String suheb1 = "abc";
        permute(suheb1, 0, suheb1.length() - 1);
    }

    public static void permute(String suheb1, int suheb2, int suheb3) {
        if (suheb2 == suheb3) {
            System.out.println(suheb1);
        } else {
            for (int i = suheb2; i <= suheb3; i++) {
                suheb1 = swap(suheb1, suheb2, i);
                permute(suheb1, suheb2 + 1, suheb3);
                suheb1 = swap(suheb1, suheb2, i);
            }
        }
    }

    public static String swap(String suheb1, int suheb2, int suheb3) {
        char[] suheb4 = suheb1.toCharArray();
        char suheb5 = suheb4[suheb2];
        suheb4[suheb2] = suheb4[suheb3];
        suheb4[suheb3] = suheb5;
        return new String(suheb4);
    }
}
