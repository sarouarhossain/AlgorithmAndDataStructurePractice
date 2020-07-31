package leetcode;

import java.util.Arrays;

public class ReverseInteger_7 {
  public static void main(String[] args) {
    //
    int input1 = 2147483647;
    // 74638471*10 = 746384710
    // 7663847412
    int input2 = -3456;
    int result = lastSolution(input1);

    System.out.println(result);
  }

  static int lastSolution(int x) {
    boolean isNeg = false;
    if (x < 0) {
      isNeg = true;
      x = -1 * x;
    }

    String input = String.valueOf(x);
    // 1234
    char[] output = new char[input.length()];
    int indexOutputArray = 0;
    for (int i = input.length() - 1; i >= 0; i--) {
      output[indexOutputArray++] = input.charAt(i);
    }

    String stringOutput = new String(output);

    int res = 0;
    try {
      res = Integer.parseInt(stringOutput);
      if (isNeg) res = -1 * res;
    } catch (NumberFormatException e) {
      return 0;
    }

    return res;
  }

  static int reverse(int x) {
    int rev_num = 0;
    while (x != 0) {
      int temp = rev_num;
      rev_num = rev_num * 10 + x % 10;
      x = x / 10;
      System.out.println("temp: " + temp + "  rev_num: " + rev_num);
      if (temp != rev_num / 10) {
        System.out.println("temp: " + temp + "  rev_num: " + rev_num);
        return 0;
      }
    }
    return (int) rev_num;
  }

  public static int solution1(int input) {
    // 2147483647
    // 746384741  > 214748364
    int res = 0;

    boolean isNegative = false;

    if (input < 0) {
      isNegative = true;
      input = -1 * input;
    }

    while (input > 0) {
      if (res > Integer.MAX_VALUE / 10) {
        return 0;
      }

      int reminder = input % 10;
      input = input / 10;
      res = res * 10 + reminder;
    }

    if (isNegative) {
      return (-1) * res;
    }
    return res;
  }
}
