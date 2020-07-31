package leetcode.linkedlist;

public class SortLinkList_148 {
  public static void main(String[] args) {
    //
    ListNode node3 = new ListNode(3);
    ListNode node1 = new ListNode(1, node3);
    ListNode node2 = new ListNode(2, node1);
    ListNode node4 = new ListNode(4, node2);

    ListNode node = sortList(node4);
    while (node != null) {
      System.out.println(node.val);
      node = node.next;
    }
  }

  public static ListNode sortList(ListNode head) {
    if (head == null || head.next == null) return head;

    ListNode slow = head;
    ListNode fast = head;
    ListNode temp = head;

    while (fast != null && fast.next != null) {
      temp = slow;
      slow = slow.next;
      fast = fast.next.next;
    }

    temp.next = null;

    ListNode left = sortList(head);
    ListNode right = sortList(slow);

    return merge(left, right);
  }

  public static ListNode merge(ListNode left, ListNode right) {
    ListNode head = new ListNode(0);
    ListNode temp = head;
    while (left != null && right != null) {
      if (left.val < right.val) {
        temp.next = left;
        left = left.next;
      } else {
        temp.next = right;
        right = right.next;
      }
      temp = temp.next;
    }

    if (left != null) {
      temp.next = left;
    }

    if (right != null) {
      temp.next = right;
    }

    return head.next;
  }
}
