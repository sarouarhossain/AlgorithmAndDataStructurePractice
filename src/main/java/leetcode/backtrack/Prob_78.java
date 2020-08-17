package leetcode.backtrack;

import java.util.ArrayList;
import java.util.List;

public class Prob_78 {
  public static void main(String[] args) {
    int[] nums = {1, 2, 3};
    System.out.println(subsets(nums));
  }

  public static List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> output = new ArrayList<>();
    backtrack(output, new ArrayList<Integer>(), nums, 0);
    return output;
  }

  public static void backtrack(List<List<Integer>> output, List<Integer> temp, int[] nums, int p) {
    System.out.println(p);
    output.add(new ArrayList<>(temp));
    for (int i = p; i < nums.length; i++) {
      temp.add(nums[i]);
      backtrack(output, temp, nums, i + 1);
      temp.remove(temp.size() - 1);
    }
  }
}
