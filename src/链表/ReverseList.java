package 链表;

public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        ListNode p = head;
        ListNode previous = null;
        ListNode reversehead = null;
        while (p != null) {
            ListNode pnext = p.next;
            if (pnext == null) {
                reversehead = p;
            }
            p.next = previous;
            previous = p;
            p = pnext;
        }
        return  reversehead;
    }
    public  static  void main(String [] args){
        ListNode p1=new ListNode(1);
        ListNode p2=new ListNode(2);
        ListNode p3=new ListNode(3);
        ListNode p4=new ListNode(4);
        p1.next=p2;
        p2.next=p3;
        p3.next=p4;
        ReverseList reverse=new ReverseList();
        ListNode result=reverse.ReverseList(p1);
        ListNode p=result;
        while (p!=null) {
            System.out.println(p.val);
            p = p.next;
        }
    }
}
