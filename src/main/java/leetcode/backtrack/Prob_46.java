package leetcode.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Prob_46 {
  public static void main(String[] args) {
    int[] input = {1, 2, 3};
    List<List<Integer>> result = permute(input);
    System.out.println(result);
  }

  public static List<List<Integer>> permute(int[] nums) {
    int length = nums.length;
    List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());
    List<List<Integer>> output = new ArrayList<>();
    backtrack(numsList, length, 0, output);
    return output;
  }

  public static void backtrack(
      List<Integer> nums, int length, int first, List<List<Integer>> output) {
    if (first == length) {
      output.add(new ArrayList<>(nums));
      return;
    }

    for (int i = first; i < length; i++) {
      Collections.swap(nums, first, i);
      backtrack(nums, length, first + 1, output);
      Collections.swap(nums, i, first);
    }
  }
}
