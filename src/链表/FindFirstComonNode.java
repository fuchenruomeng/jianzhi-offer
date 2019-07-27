package 链表;

public class FindFirstComonNode {
    public ListNode FindFirstCommonNode(ListNode head1, ListNode head2){
        int length1=ListNodeLength(head1);
        int length2=ListNodeLength(head2);
        ListNode p1=head1;
        ListNode p2=head2;
        if (length1>length2){
            int difference1=length1-length2;
            while (difference1>0){
            p1=p1.next;
            difference1--;
            }
        }else {
            int difference2 = length2 - length1;
            while (difference2 > 0) {
                p2 = p2.next;
                difference2--;
            }
        }
        while (p1!=p2){
            p1=p1.next;
            p2=p2.next;
            }
        return p1;
    }
    public int ListNodeLength(ListNode head){
        ListNode p=head;
        int length=0;
        while (p!=null){
            p=p.next;
            length++;
        }
        return  length;
    }
    public  static  void main(String [] args){
        ListNode f1=new ListNode(1);
        ListNode f2=new ListNode(2);
        ListNode f3=new ListNode(3);
        ListNode f4=new ListNode(4);
        f1.next=f2;
        f2.next=f3;
        f3.next=f4;
        ListNode s1=new ListNode(5);
        s1.next=f3;
        f3.next=f4;
        FindFirstComonNode common=new FindFirstComonNode();
        ListNode result=common.FindFirstCommonNode(f1,s1);
        System.out.println(result.val);
    }
}








