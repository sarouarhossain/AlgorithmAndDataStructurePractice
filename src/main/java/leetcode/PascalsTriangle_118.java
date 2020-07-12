package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle_118 {
  public static void main(String[] args) {
    //
    List<List<Integer>> res = generate(0);

    System.out.println(res);
  }

  public static List<List<Integer>> generate(int numRows) {
    if (numRows == 0) return new ArrayList<>();
    List<Integer> begin = new ArrayList<>();
    begin.add(1);

    List<List<Integer>> result = new ArrayList<>();
    result.add(begin);

    for (int i = 1; i < numRows; i++) {
      List<Integer> prev = result.get(i - 1);
      List<Integer> current = new ArrayList<>();

      for (int j = 0; j <= i; j++) {
        int prevOne = 0;
        int prevTwo = 0;

        if (j - 1 >= 0) {
          prevOne = prev.get(j - 1);
        }

        if (j <= prev.size() - 1) {
          prevTwo = prev.get(j);
        }

        current.add(prevOne + prevTwo);
      }

      result.add(current);
    }

    return result;
  }
}
