package 链表;

public class EntryNodeOfLoop {
    public ListNode EntryNodeOfLoop(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while (fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                ListNode p = head;
                while (slow != p) {
                    slow = slow.next;
                    p = p.next;
                }
            }
        }
      return slow;
    }
    public  static  void main(String [] args){
        ListNode p1=new ListNode(1);
        ListNode p2=new ListNode(2);
        ListNode p3=new ListNode(3);
        ListNode p4=new ListNode(4);
        ListNode p5=new ListNode(5);
        ListNode p6=new ListNode(6);
        p1.next=p2;
        p2.next=p3;
        p3.next=p4;
        p4.next=p5;
        p6.next=p3;
        EntryNodeOfLoop entry=new EntryNodeOfLoop();
        ListNode result=entry.EntryNodeOfLoop(p1);
        System.out.println(result.val);
    }
}
