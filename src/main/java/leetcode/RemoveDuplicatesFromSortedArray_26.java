package leetcode;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray_26 {
  public static void main(String[] args) {
    //
    // int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    int[] nums = {1};

    int x = removeDuplicates(nums);

    System.out.println(x);
    System.out.println(Arrays.toString(nums));
  }

  public static int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;
    int c = nums[0];
    int p = 1;
    for (int i = 0; i < nums.length; i++) {
      if (c != nums[i]) {
        c = nums[i];
        int t = nums[p];
        nums[p] = nums[i];
        nums[i] = t;
        p++;
      }
    }

    return p;
  }
}
