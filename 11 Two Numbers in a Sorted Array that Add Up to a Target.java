public class Question11 {
    public static void main(String[] args) {
        int[] suheb1 = {1, 2, 3, 4, 5};
        int target = 9;
        int suheb2 = 0, suheb3 = suheb1.length - 1;

        while (suheb2 < suheb3) {
            int sum = suheb1[suheb2] + suheb1[suheb3];
            if (sum == target) {
                System.out.println("Numbers: " + suheb1[suheb2] + " and " + suheb1[suheb3]);
                return;
            }
            if (sum < target) {
                suheb2++;
            } else {
                suheb3--;
            }
        }

        System.out.println("No such pair found.");
    }
}
