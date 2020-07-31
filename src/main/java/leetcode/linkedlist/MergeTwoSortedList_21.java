package leetcode.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedList_21 {
  public static void main(String[] args) {
    //
    ListNode l1_2 = new ListNode(3);
    ListNode l1_1 = new ListNode(2, l1_2);
    ListNode l1 = new ListNode(1, l1_1);

    ListNode l2_2 = new ListNode(4);
    ListNode l2_1 = new ListNode(3, l2_2);
    ListNode l2 = new ListNode(1, l2_1);

    ListNode n = mergeTwoLists(l1, l2);

    ListNode temp = n;
    while (temp != null) {
      System.out.println(temp.val);
      temp = temp.next;
    }
  }

  public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null && l2 == null) return null;

    List<Integer> list = new ArrayList<>();

    ListNode temp = l1;
    while (temp != null) {
      list.add(temp.val);
      temp = temp.next;
    }

    ListNode temp1 = l2;
    while (temp1 != null) {
      list.add(temp1.val);
      temp1 = temp1.next;
    }

    Collections.sort(list);

    ListNode res = new ListNode(list.get(0));
    ListNode temp2 = res;
    for (int i = 1; i < list.size(); i++) {
      ListNode newNode = new ListNode(list.get(i));
      temp2.next = newNode;
      temp2 = temp2.next;
    }

    return res;
  }
}
