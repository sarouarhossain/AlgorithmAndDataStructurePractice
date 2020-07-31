package leetcode;

public class AddTwoNumbers_2 {
  public static void main(String[] args) {
    //
    ListNode n12 = new ListNode(4);
    ListNode n11 = new ListNode(6, n12);
    ListNode n1 = new ListNode(5, n11);

    ListNode n22 = new ListNode(3);
    ListNode n21 = new ListNode(4, n22);
    ListNode n2 = new ListNode(2, n21);

    ListNode res = addTwoNumbers(n1, n2);

    while (res != null) {
      System.out.println(res.val);
      res = res.next;
    }
  }

  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    if (l1 == null && l2 == null) return null;
    ListNode head = new ListNode();
    ListNode res = head;
    int carry = 0;

    while (!(l1 == null && l2 == null)) {
      int a = 0, b = 0;
      if (l1 != null) {
        a = l1.val;
        l1 = l1.next;
      }

      if (l2 != null) {
        b = l2.val;
        l2 = l2.next;
      }

      int sum = carry + a + b;
      res.val = sum % 10;

      if (l1 != null || l2 != null) {
        res.next = new ListNode();
        res = res.next;
      }
      carry = sum / 10;
    }

    if (carry != 0) {
      ListNode node = new ListNode();
      node.val = carry;

      res.next = node;
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
