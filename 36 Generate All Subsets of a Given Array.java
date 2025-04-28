import java.util.*;

public class Question36 {
    public static List<List<Integer>> subsets(int[] suheb1) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for (int num : suheb1) {
            int size = result.size();
            for (int i = 0; i < size; i++) {
                List<Integer> suheb2 = new ArrayList<>(result.get(i));
                suheb2.add(num);
                result.add(suheb2);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] suheb1 = {1, 2, 3};
        System.out.println("Subsets: " + subsets(suheb1));
    }
}
