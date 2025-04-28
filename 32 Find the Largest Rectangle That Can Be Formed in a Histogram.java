import java.util.Stack;

public class Question32 {
    public static int largestRectangleArea(int[] suheb1) {
        Stack<Integer> suheb2 = new Stack<>();
        int suheb3 = 0;
        for (int i = 0; i <= suheb1.length; i++) {
            while (!suheb2.isEmpty() && (i == suheb1.length || suheb1[suheb2.peek()] > suheb1[i])) {
                int suheb4 = suheb2.pop();
                int suheb5 = suheb2.isEmpty() ? i : i - suheb2.peek() - 1;
                suheb3 = Math.max(suheb3, suheb1[suheb4] * suheb5);
            }
            suheb2.push(i);
        }
        return suheb3;
    }

    public static void main(String[] args) {
        int[] suheb1 = {2, 1, 5, 6, 2, 3};
        System.out.println("Largest rectangle area: " + largestRectangleArea(suheb1));
    }
}
