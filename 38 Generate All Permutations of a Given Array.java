import java.util.*;

public class Question38 {
    public static List<List<Integer>> permute(int[] suheb1) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(suheb1, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] suheb1, List<Integer> temp, List<List<Integer>> result) {
        if (temp.size() == suheb1.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < suheb1.length; i++) {
            if (temp.contains(suheb1[i])) continue;
            temp.add(suheb1[i]);
            backtrack(suheb1, temp, result);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] suheb1 = {1, 2, 3};
        System.out.println("Permutations: " + permute(suheb1));
    }
}
