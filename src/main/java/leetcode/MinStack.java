package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinStack {
  List<Integer> list;
  List<Integer> minList;

  public MinStack() {
    list = new ArrayList<>();
    minList = new ArrayList<>();
  }

  public void push(int x) {
    list.add(x);
    minList.add(x);
  }

  public void pop() {
    int size = list.size();
    Integer data = list.get(size - 1);
    list.remove(size - 1);
    minList.remove(data);
  }

  public int top() {
    int size = list.size();
    return list.get(size - 1);
  }

  public int getMin() {
    return Collections.min(minList);
  }

  public static void main(String[] args) {
    //
    MinStack minStack = new MinStack();
    minStack.push(2);
    minStack.push(0);
    minStack.push(3);
    minStack.push(0);
    System.out.println(minStack.getMin());
    minStack.pop();
    System.out.println(minStack.getMin());
    minStack.pop();
    System.out.println(minStack.getMin());
    minStack.pop();
    System.out.println(minStack.getMin());
  }
}
