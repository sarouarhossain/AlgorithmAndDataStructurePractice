package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class IntersectionofTwoArraysII_350 {
  public static void main(String[] args) {
    // [-2147483648,1,2,3]
    // [1,-2147483648,-2147483648]
    int[] num1 = {-2147483648, 1, 2, 3};
    int[] num2 = {1, -2147483648, -2147483648};

    int[] result = intersect(num1, num2);

    System.out.println(Arrays.toString(result));
  }

  public static int[] intersect(int[] nums1, int[] nums2) {
    List<Integer> input1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
    List<Integer> input2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());

    Collections.sort(input1);
    Collections.sort(input2);

    int i = 0, j = 0;

    List<Integer> result = new ArrayList<>();
    while (i < input1.size() && j < input2.size()) {
      Integer in1 = input1.get(i);
      Integer in2 = input2.get(j);
      if (in1.equals(in2)) {
        result.add(in1);
        i++;
        j++;
      } else if (in1 > in2) {
        j++;
      } else {
        i++;
      }
    }

    return result.stream().mapToInt(x -> x).toArray();
  }
}
