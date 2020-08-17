package leetcode.devideAndCon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Prob215 {
  public static void main(String[] args) {
    int[] input = {3, 2, 1, 5, 6, 4};
    System.out.println(findKthLargest(input, 2));
  }

  public static int findKthLargest(int[] nums, int k) {
    Arrays.sort(nums);
    return nums[nums.length - k];
  }
}
