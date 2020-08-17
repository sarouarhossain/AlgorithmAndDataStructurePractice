package leetcode.backtrack;

import java.util.ArrayList;
import java.util.List;

public class Prob_22 {
  public static void main(String[] args) {
    System.out.println(generateParenthesis(4));
  }

  public static List<String> generateParenthesis(int n) {
    List<String> output = new ArrayList<>();
    String str = "";
    backtrack(n, n, str, output);
    return output;
  }

  public static void backtrack(int left, int right, String str, List<String> output) {
    if (left == 0 && right == 0) {
      output.add(str);
      return;
    }

    if (left == right) {
      backtrack(left - 1, right, str + "(", output);
    }

    if (left == 0) {
      backtrack(left, right - 1, str + ")", output);
    }

    if (left < right && left != 0) {
      backtrack(left - 1, right, str + "(", output);
      backtrack(left, right - 1, str + ")", output);
    }
  }
}
