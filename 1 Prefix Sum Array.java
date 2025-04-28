public class Question1 {
    public static void main(String[] args) {
        int[] suheb1 = {1, 2, 3, 4, 5};
        int[] suheb2 = new int[suheb1.length];
        suheb2[0] = suheb1[0];

        for (int i = 1; i < suheb1.length; i++) {
            suheb2[i] = suheb2[i - 1] + suheb1[i];
        }

        for (int i : suheb2) {
            System.out.print(i + " ");
        }
    }
}
