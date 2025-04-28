public class Question50 {
    public static int equilibriumIndex(int[] suheb1) {
        int totalSum = 0;
        for (int num  suheb1) totalSum += num;

        int leftSum = 0;
        for (int i = 0; i  suheb1.length; i++) {
            totalSum -= suheb1[i];
            if (leftSum == totalSum) return i;
            leftSum += suheb1[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] suheb1 = {1, 2, 3, 4, 5, 6};
        System.out.println(Equilibrium index  + equilibriumIndex(suheb1));
    }
}
