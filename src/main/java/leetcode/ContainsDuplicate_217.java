package leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate_217 {
  public static void main(String[] args) {
    //
    int[] input = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
    int[] input1 = {1, 2, 3, 4};
    System.out.println(containsDuplicate(input1));
  }

  public static boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>();

    for (int x : nums) {
      if (!set.add(x)) {
        return true;
      }
    }
    return false;
  }
}
