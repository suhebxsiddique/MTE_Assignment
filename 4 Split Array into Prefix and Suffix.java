public class Question4 {
    public static void main(String[] args) {
        int[] suheb1 = {1, 2, 3, 4, 5};
        int sum = 0, totalSum = 0;

        for (int i : suheb1) {
            totalSum += i;
        }

        for (int i = 0; i < suheb1.length; i++) {
            sum += suheb1[i];
            totalSum -= suheb1[i];
            if (sum == totalSum) {
                System.out.println("Array can be split at index " + i);
                return;
            }
        }

        System.out.println("Array cannot be split.");
    }
}
