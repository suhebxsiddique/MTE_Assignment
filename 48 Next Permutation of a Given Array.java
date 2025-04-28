public class Question48 {
    public static void nextPermutation(int[] suheb1) {
        int i = suheb1.length - 2;
        while (i >= 0 && suheb1[i] >= suheb1[i + 1]) i--;
        if (i >= 0) {
            int j = suheb1.length - 1;
            while (suheb1[j] <= suheb1[i]) j--;
            swap(suheb1, i, j);
        }
        reverse(suheb1, i + 1);
    }

    private static void swap(int[] suheb1, int i, int j) {
        int temp = suheb1[i];
        suheb1[i] = suheb1[j];
        suheb1[j] = temp;
    }

    private static void reverse(int[] suheb1, int start) {
        int end = suheb1.length - 1;
        while (start < end) {
            swap(suheb1, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] suheb1 = {1, 2, 3};
        nextPermutation(suheb1);
        System.out.println("Next permutation: " + Arrays.toString(suheb1));
    }
}
