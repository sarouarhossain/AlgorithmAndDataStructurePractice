package leetcode;

public class MergeTwoSortedList_21 {

  public static void main(String[] args) {
    //
    ListNode n14 = new ListNode(7);
    ListNode n13 = new ListNode(5, n14);
    ListNode n12 = new ListNode(4, n13);
    ListNode n11 = new ListNode(2, n12);
    ListNode n1 = new ListNode(1, n11);

    ListNode n22 = new ListNode(4);
    ListNode n21 = new ListNode(3, n22);
    ListNode n2 = new ListNode(1, n21);

    ListNode x = mergeTwoLists(null, null);

    ListNode t = x;
    //    while (t.next != null) {
    //      System.out.println(t.val);
    //      t = t.next;
    //    }
    System.out.println(t.val);
  }

  public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null && l2 == null) return null;

    ListNode r = new ListNode();
    ListNode t = r;

    while (l1 != null && l2 != null) {
      if (l1.val <= l2.val) {
        r.val = l1.val;
        r.next = new ListNode();
        r = r.next;
        l1 = l1.next;
      } else {
        r.val = l2.val;
        r.next = new ListNode();
        r = r.next;
        l2 = l2.next;
      }
    }

    if (l1 != null) {
      r.val = l1.val;
      r.next = l1.next;
    }

    if (l2 != null) {
      r.val = l2.val;
      r.next = l2.next;
    }

    return t;
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
