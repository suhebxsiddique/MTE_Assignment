import java.util.*;

public class Question31 {
    public static void maxSlidingWindow(int[] suheb1, int k) {
        Deque<Integer> suheb2 = new LinkedList<>();
        for (int i = 0; i < suheb1.length; i++) {
            while (!suheb2.isEmpty() && suheb1[suheb2.peekLast()] <= suheb1[i]) {
                suheb2.pollLast();
            }
            suheb2.offerLast(i);

            if (suheb2.peekFirst() <= i - k) {
                suheb2.pollFirst();
            }

            if (i >= k - 1) {
                System.out.print(suheb1[suheb2.peekFirst()] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] suheb1 = {1, 3, -1, -3, 5, 3, 6, 7};
        maxSlidingWindow(suheb1, 3);
    }
}
