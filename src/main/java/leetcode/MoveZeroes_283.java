package leetcode;

import java.util.Arrays;

public class MoveZeroes_283 {
  public static void main(String[] args) {
    //
    int[] input = {0, 1, 0, 3, 12};
    // int[] input = {0, 0, 1};
    moveZeroes(input);
    System.out.println(Arrays.toString(input));
  }

  public static void moveZeroes(int[] nums) {
    int lastZeroIndex = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        int t = nums[lastZeroIndex];
        nums[lastZeroIndex++] = nums[i];
        nums[i] = t;
      }
    }
  }
}
