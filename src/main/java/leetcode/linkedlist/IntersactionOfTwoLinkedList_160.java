package leetcode.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class IntersactionOfTwoLinkedList_160 {
  public static void main(String[] args) {
    //
    ListNode node5 = new ListNode(5);
    ListNode node4 = new ListNode(4, node5);
    ListNode node8 = new ListNode(8, node4);
    ListNode node1 = new ListNode(1, node8);
    ListNode headA = new ListNode(4, node1);

    ListNode node1_1 = new ListNode(1, node8);
    ListNode node6 = new ListNode(6, node1_1);
    ListNode headB = new ListNode(5, node6);

    ListNode node = method3(null, null);

    System.out.println(node);
  }

  public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode a = headA;
    ListNode b = headB;

    while (a != b) {
      a = a != null ? a.next : headB;
      b = b != null ? b.next : headA;
    }

    return a;
  }

  public static ListNode method2(ListNode headA, ListNode headB) {
    Set<ListNode> set = new HashSet<>();
    ListNode t = headA;
    while (t != null) {
      set.add(t);
      t = t.next;
    }

    ListNode t1 = headB;
    while (t1 != null) {
      if (set.contains(t1)) {
        return t1;
      }
      t1 = t1.next;
    }
    return null;
  }

  public static ListNode method3(ListNode headA, ListNode headB) {
    Integer sizeA = 0;
    Integer sizeB = 0;
    ListNode tA = headA, tAA = headA;
    ListNode tB = headB, tBB = headB;

    while (tA != null) {
      sizeA++;
      tA = tA.next;
    }

    while (tB != null) {
      sizeB++;
      tB = tB.next;
    }

    if (sizeA > sizeB) {
      Integer t = sizeA - sizeB;
      while (t > 0) {
        tAA = tAA.next;
        t--;
      }
    } else {
      Integer t = sizeB - sizeA;
      while (t > 0) {
        tBB = tBB.next;
        t--;
      }
    }

    while (tAA != null) {
      if (tAA == tBB) {
        return tAA;
      }

      tAA = tAA.next;
      tBB = tBB.next;
    }

    return null;
  }
}
