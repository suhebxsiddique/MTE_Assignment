public class Question14 {
    public static double findMedianSortedArrays(int[] suheb1, int[] suheb2) {
        if (suheb1.length > suheb2.length) {
            int[] temp = suheb1;
            suheb1 = suheb2;
            suheb2 = temp;
        }

        int x = suheb1.length, y = suheb2.length;
        int low = 0, high = x;

        while (low <= high) {
            int suheb3 = (low + high) / 2;
            int suheb4 = (x + y + 1) / 2 - suheb3;

            int maxLeftX = (suheb3 == 0) ? Integer.MIN_VALUE : suheb1[suheb3 - 1];
            int minRightX = (suheb3 == x) ? Integer.MAX_VALUE : suheb1[suheb3];

            int maxLeftY = (suheb4 == 0) ? Integer.MIN_VALUE : suheb2[suheb4 - 1];
            int minRightY = (suheb4 == y) ? Integer.MAX_VALUE : suheb2[suheb4];

            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                if ((x + y) % 2 == 0) {
                    return (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2.0;
                } else {
                    return Math.max(maxLeftX, maxLeftY);
                }
            } else if (maxLeftX > minRightY) {
                high = suheb3 - 1;
            } else {
                low = suheb3 + 1;
            }
        }
        return 0.0;
    }

    public static void main(String[] args) {
        int[] suheb1 = {1, 3};
        int[] suheb2 = {2};

        System.out.println("Median: " + findMedianSortedArrays(suheb1, suheb2));
    }
}
