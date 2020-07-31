package leetcode;

import java.util.Arrays;

public class StringToInteger_8 {
  public static void main(String[] args) {
    //
    String in1 = "4193 with words";
    String in2 = "   -42";
    String in3 = "words and 987";
    String in4 = "-91283472332";
    String in5 = "91283472332";
    System.out.println(myAtoi(in1));
  }

  public static int myAtoi(String str) {

    char[] charlist = str.toCharArray();

    StringBuilder sb = new StringBuilder();
    boolean numFound = false;
    int charAdded = 0;
    for (char c : charlist) {
      if (sb.length() > 0 && (c == ' ' || c == '+' || c == '-')) break;

      if (c == ' ' || (c >= '0' && c <= '9') || c == '-' || c == '+') {
        if (c != ' ') {
          if (c == '-' || c == '+') charAdded++;
          numFound = true;
          sb.append(c);
        }
      } else {
        if (!numFound) return 0;
        break;
      }
    }
    if (charAdded > 1) return 0;
    if (sb.length() == 0 || (sb.length() == 1 && (sb.charAt(0) == '-' || sb.charAt(0) == '+')))
      return 0;
    if (sb.charAt(sb.length() - 1) == '-' || sb.charAt(sb.length() - 1) == '+') {
      sb = sb.deleteCharAt(sb.length() - 1);
    }

    String data = sb.toString();

    if (data.startsWith("-")) {
      try {
        return Integer.parseInt(data);
      } catch (NumberFormatException e) {
        return Integer.MIN_VALUE;
      }
    } else {
      try {
        return Integer.parseInt(data);
      } catch (NumberFormatException e) {
        return Integer.MAX_VALUE;
      }
    }
  }
}
