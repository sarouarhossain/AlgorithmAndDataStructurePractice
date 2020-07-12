package leetcode;

public class OddEvenLinkedList_328 {
  public static void main(String[] args) {
    //
    //    ListNode n9 = new ListNode(10);
    //    ListNode n8 = new ListNode(7, n9);
    //    ListNode n7 = new ListNode(4, n8);
    //    ListNode n5 = new ListNode(6, n7);
    //    ListNode n4 = new ListNode(5, n5);
    ListNode n3 = new ListNode(3);
    ListNode n2 = new ListNode(2, n3);
    ListNode n1 = new ListNode(1, n2);

    ListNode x = oddEvenList(n1);

    while (x != null) {
      System.out.println(x.val);
      x = x.next;
    }
  }

  public static ListNode oddEvenList(ListNode head) {
    if (head == null) return null;
    ListNode odd = head;

    ListNode even = null;
    ListNode temp = null;
    if (head.next != null) {
      even = head.next;
      if (head.next.next != null) {
        temp = head.next.next;
      }
    }

    ListNode tOdd = odd;
    ListNode tEven = even;
    while (temp != null) {
      odd.next = temp;
      odd = odd.next;

      if (temp.next != null) {
        even.next = temp.next;
        even = even.next;
        temp = temp.next.next;
      } else {
        temp = null;
      }
      even.next = null;
      odd.next = null;
    }

    //    System.out.println("ODD:");
    //    while (tOdd != null) {
    //      System.out.println(tOdd.val);
    //      tOdd = tOdd.next;
    //    }
    //    System.out.println("EVEN:");
    //    while (tEven != null) {
    //      System.out.println(tEven.val);
    //      tEven = tEven.next;
    //    }

    odd.next = tEven;
    return tOdd;
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
