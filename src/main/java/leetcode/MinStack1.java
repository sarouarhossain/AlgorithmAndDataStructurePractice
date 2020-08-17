package leetcode;

import java.util.Stack;

public class MinStack1 {
  public static void main(String[] args) {
    //
    MinStack1 minStack = new MinStack1();
    minStack.push(2);
    minStack.push(0);
    minStack.push(3);
    minStack.push(0);
    System.out.println(minStack.stack);
    System.out.println(minStack.getMin());
    minStack.pop();
    System.out.println(minStack.getMin());
    minStack.pop();
    System.out.println(minStack.getMin());
    minStack.pop();
    System.out.println(minStack.getMin());
  }

  Stack<Integer> stack = new Stack<>();
  int min = Integer.MAX_VALUE;

  public void push(int x) {
    if (x <= min) {
      stack.push(min);
      min = x;
    }
    stack.push(x);
  }

  public void pop() {
    int peek = stack.pop();
    if (peek == min) {
      min = stack.pop();
    }
  }

  public int top() {
    return stack.peek();
  }

  public int getMin() {
    return min;
  }
}
