package leetcode.linkedlist;

public class Intersection_160 {
  public static void main(String[] args) {
    ListNode a4 = new ListNode(5);
    ListNode a3 = new ListNode(4, a4);
    ListNode a2 = new ListNode(8, a3);
    ListNode a1 = new ListNode(1, a2);
    ListNode headA = new ListNode(4, a1);

    ListNode b5 = new ListNode(5);
    ListNode b4 = new ListNode(4, b5);
    ListNode b3 = new ListNode(8, b4);
    ListNode b2 = new ListNode(1, b3);
    ListNode b1 = new ListNode(6, b2);
    ListNode headB = new ListNode(5, b1);
  }

  //  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
  //      while (headA!=null || headB !=null){
  //          if(headA.val == headB.val)
  //      }
  //  }
}
