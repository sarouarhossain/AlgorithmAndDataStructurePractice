package leetcode;

import java.util.Stack;

public class ValidParentheses_20 {
  public static void main(String[] args) {
    //
    System.out.println(isValid("([)]"));
  }

  public static boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      Character ch = s.charAt(i);

      if (ch.equals(')')) {
        if (!stack.empty()) {
          Character stch = stack.pop();
          if (stch != '(') return false;
        } else return false;
      } else if (ch.equals('}')) {
        if (!stack.empty()) {
          Character stch = stack.pop();
          if (stch != '{') return false;
        } else return false;

      } else if (ch.equals(']')) {
        if (!stack.empty()) {
          Character stch = stack.pop();
          if (stch != '[') return false;
        } else return false;

      } else {
        stack.push(ch);
      }
    }

    return stack.empty();
  }
}
