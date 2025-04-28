public class Question3 {
    public static void main(String[] args) {
        int[] suheb1 = {1, 2, 3, 4, 5};
        int suheb2 = 0, suheb3 = 0;

        for (int i : suheb1) {
            suheb3 += i;
        }

        for (int i = 0; i < suheb1.length; i++) {
            suheb3 -= suheb1[i];
            if (suheb2 == suheb3) {
                System.out.println("Equilibrium index is: " + i);
                return;
            }
            suheb2 += suheb1[i];
        }

        System.out.println("No equilibrium index found.");
    }
}
