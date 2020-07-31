package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlusOne_66 {
  public static void main(String[] args) {
    //
    int[] input = {1, 2, 3};
    int[] res = plusOne(input);

    System.out.println(Arrays.toString(res));
  }

  public static int[] plusOne(int[] digits) {
    List<Integer> result = new ArrayList<>();
    int size = digits.length;

    int carry = 0;
    for (int i = size - 1; i >= 0; i--) {
      int val;
      if (i == size - 1) {
        val = digits[i] + 1;
      } else {
        val = digits[i] + carry;
      }

      carry = val / 10;
      result.add(val % 10);
    }

    if (carry > 0) {
      result.add(carry);
    }
    Collections.reverse(result);
    return result.stream().mapToInt(j -> j).toArray();
  }
}
