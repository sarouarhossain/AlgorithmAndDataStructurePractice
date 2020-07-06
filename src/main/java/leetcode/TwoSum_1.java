package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {
  public static void main(String[] args) {
    //
    int[] nums = {2, 7, 11, 15};
    int target = 9;

    int[] result = func(nums, target);

    System.out.println(Arrays.toString(result));
  }

  static int[] func(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int checkValue = target - nums[i];
      if (map.containsKey(checkValue)) {
        return new int[] {map.get(checkValue), i};
      }
      map.put(nums[i], i);
    }

    return new int[0];
  }
}
