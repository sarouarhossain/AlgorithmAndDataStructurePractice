package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HappyNumber_202 {
  public static void main(String[] args) {
    //
    System.out.println(isHappy(20));
  }

  public static boolean isHappy(int n) {
    Set<Integer> set = new HashSet<>();
    while (n != 1) {
      if (set.contains(n)) return false;
      set.add(n);
      String num = String.valueOf(n);

      int sum = 0;
      for (int i = 0; i < num.length(); i++) {
        int numValue = Character.getNumericValue(num.charAt(i));
        sum = sum + numValue * numValue;
      }
      n = sum;
    }
    return true;
  }
}
