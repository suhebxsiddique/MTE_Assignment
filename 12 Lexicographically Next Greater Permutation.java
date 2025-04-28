public class Question12 {
    public static void main(String[] args) {
        int[] suheb1 = {1, 2, 3};
        int suheb2 = -1;

        for (int i = suheb1.length - 2; i >= 0; i--) {
            if (suheb1[i] < suheb1[i + 1]) {
                suheb2 = i;
                break;
            }
        }

        if (suheb2 == -1) {
            System.out.println("No next permutation.");
            return;
        }

        int suheb3 = -1;
        for (int i = suheb1.length - 1; i > suheb2; i--) {
            if (suheb1[i] > suheb1[suheb2]) {
                suheb3 = i;
                break;
            }
        }

        int temp = suheb1[suheb2];
        suheb1[suheb2] = suheb1[suheb3];
        suheb1[suheb3] = temp;

        java.util.Arrays.sort(suheb1, suheb2 + 1, suheb1.length);
        System.out.println("Next permutation: " + java.util.Arrays.toString(suheb1));
    }
}
