import java.util.Stack;

public class Question25 {
    public static void nextGreaterElement(int[] suheb1) {
        Stack<Integer> suheb2 = new Stack<>();
        for (int i = 0; i < suheb1.length; i++) {
            while (!suheb2.isEmpty() && suheb1[i] > suheb1[suheb2.peek()]) {
                suheb1[suheb2.pop()] = suheb1[i];
            }
            suheb2.push(i);
        }

        while (!suheb2.isEmpty()) {
            suheb1[suheb2.pop()] = -1;
        }

        for (int i : suheb1) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] suheb1 = {4, 5, 2, 10};
        nextGreaterElement(suheb1);
    }
}
