import java.util.*;

public class Question37 {
    public static List<List<Integer>> combinationSum(int[] suheb1, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(suheb1, target, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] suheb1, int target, int start, List<Integer> temp, List<List<Integer>> result) {
        if (target < 0) return;
        if (target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < suheb1.length; i++) {
            temp.add(suheb1[i]);
            backtrack(suheb1, target - suheb1[i], i, temp, result);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] suheb1 = {2, 3, 6, 7};
        System.out.println("Unique combinations: " + combinationSum(suheb1, 7));
    }
}
