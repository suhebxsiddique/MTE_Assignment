public class Question9 {
    public static void main(String[] args) {
        String[] suheb1 = {"flower", "flow", "flight"};
        String suheb2 = suheb1[0];

        for (int i = 1; i < suheb1.length; i++) {
            while (suheb1[i].indexOf(suheb2) != 0) {
                suheb2 = suheb2.substring(0, suheb2.length() - 1);
            }
        }

        System.out.println("Longest common prefix: " + suheb2);
    }
}
