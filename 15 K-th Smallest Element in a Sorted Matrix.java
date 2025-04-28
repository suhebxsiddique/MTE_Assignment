import java.util.PriorityQueue;

public class Question15 {
    public static int kthSmallest(int[][] suheb1, int k) {
        PriorityQueue<Integer> suheb2 = new PriorityQueue<>();

        for (int i = 0; i < suheb1.length; i++) {
            for (int j = 0; j < suheb1[i].length; j++) {
                suheb2.offer(suheb1[i][j]);
            }
        }

        for (int i = 1; i < k; i++) {
            suheb2.poll();
        }

        return suheb2.poll();
    }

    public static void main(String[] args) {
        int[][] suheb1 = {
            {1, 5, 9},
            {10, 11, 13},
            {12, 13, 15}
        };
        int k = 8;

        System.out.println("K-th smallest element: " + kthSmallest(suheb1, k));
    }
}
