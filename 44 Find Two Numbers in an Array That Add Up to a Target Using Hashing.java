import java.util.*;

public class Question44 {
    public static boolean twoSum(int[] suheb1, int target) {
        Set<Integer> suheb2 = new HashSet<>();
        for (int num : suheb1) {
            if (suheb2.contains(target - num)) {
                return true;
            }
            suheb2.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] suheb1 = {2, 7, 11, 15};
       
