package leetcode.linkedlist;

public class PalindromeLinkedList_234 {
  public static void main(String[] args) {
    //
    // ListNode x = new ListNode(5);
    ListNode node3 = new ListNode(1);
    ListNode node1 = new ListNode(2, node3);
    ListNode node2 = new ListNode(1, node1);
    ListNode node4 = new ListNode(1, node2);

    System.out.println(isPalindrome(node4));
  }

  public static boolean isPalindrome(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    if (fast != null) {
      slow = slow.next;
    }

    slow = reverse(slow);
    fast = head;

    while (slow != null) {
      if (slow.val != fast.val) {
        return false;
      }
      slow = slow.next;
      fast = fast.next;
    }

    return true;
  }

  public static ListNode reverse(ListNode head) {
    ListNode current = head;
    ListNode prev = null;
    ListNode next = current;

    while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }

    return prev;
  }
}
