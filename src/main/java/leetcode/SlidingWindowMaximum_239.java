package leetcode;

import java.util.*;

public class SlidingWindowMaximum_239 {
  public static void main(String[] args) {
    //
    int[] nums = {7, 2, 4};
    int k = 2;

    System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));

    //    Deque<Integer> deque = new ArrayDeque<>();
    //    deque.add(1);
    //    deque.add(2);
    //    deque.add(4);
    //
    //    System.out.println(deque.peekLast());
  }

  public static int[] maxSlidingWindow(int[] nums, int k) {
    Deque<Integer> deque = new ArrayDeque<>();
    List<Integer> res = new ArrayList<>();

    int i = 0, j = 0, length = nums.length;
    while (j < length) {
      while (deque.peekLast() != null && nums[j] >= nums[deque.peekLast()]) {
        deque.pollLast();
      }
      deque.add(j);

      if (j - i + 1 == k || j + 1 == length) {
        res.add(nums[deque.peekFirst()]);
        i++;
        while (deque.peekFirst() != null && deque.peekFirst() < i) {
          deque.pollFirst();
        }
      }
      j++;
    }

    return res.stream().mapToInt(x -> x).toArray();
  }
}
