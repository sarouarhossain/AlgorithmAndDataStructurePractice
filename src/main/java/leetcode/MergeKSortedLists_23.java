package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeKSortedLists_23 {
  public static void main(String[] args) {
    //
    ListNode n12 = new ListNode(5);
    ListNode n11 = new ListNode(4, n12);
    ListNode n1 = new ListNode(1, n11);

    ListNode n22 = new ListNode(4);
    ListNode n21 = new ListNode(3, n22);
    ListNode n2 = new ListNode(1, n21);

    ListNode n31 = new ListNode(6);
    ListNode n3 = new ListNode(2, n31);

    ListNode[] list = {n1, n2, n3};

    ListNode x = mergeKLists(list);

    while (x.next != null) {
      System.out.println(x.val);
      x = x.next;
    }
    System.out.println(x.val);
  }

  public static ListNode mergeKLists(ListNode[] lists) {
    List<Integer> dataList = new ArrayList<>();

    for (int i = 0; i < lists.length; i++) {
      ListNode x = lists[i];
      while (x != null) {
        dataList.add(x.val);
        x = x.next;
      }
    }

    if (dataList.isEmpty()) return null;
    Collections.sort(dataList);

    ListNode head = new ListNode();
    ListNode temp = head;

    int size = dataList.size();
    for (int i = 0; i < size; i++) {
      Integer x = dataList.get(i);
      temp.val = x;
      if (i < size - 1) {
        temp.next = new ListNode();
        temp = temp.next;
      }
    }

    return head;
  }

  public static class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }
}
