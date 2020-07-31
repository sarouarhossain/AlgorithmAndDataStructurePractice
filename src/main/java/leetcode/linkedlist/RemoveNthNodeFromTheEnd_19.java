package leetcode.linkedlist;

public class RemoveNthNodeFromTheEnd_19 {
  public static void main(String[] args) {
    //
    ListNode x = new ListNode(5);
    ListNode node3 = new ListNode(4, x);
    ListNode node1 = new ListNode(3, node3);
    ListNode node2 = new ListNode(2, node1);
    ListNode node4 = new ListNode(1, node2);

    ListNode node = removeNthFromEnd(x, 1);
    while (node != null) {
      System.out.println(node.val);
      node = node.next;
    }
  }

  public static ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode t = head;
    Integer size = 0;
    while (t != null) {
      size++;
      t = t.next;
    }

    if (size == 1) return null;

    Integer x = size - n + 1;
    ListNode curr = head;
    ListNode prev = head;
    while (x > 1) {
      prev = curr;
      curr = curr.next;
      x--;
    }

    if (curr.next != null) {
      curr.val = curr.next.val;
      curr.next = curr.next.next;
    } else {
      prev.next = null;
    }

    return head;
  }
}
