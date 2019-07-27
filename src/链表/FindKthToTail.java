package 链表;

public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head, int k){
        if (k==0){
            return null;
        }
        int l=ListNodeLength(head);
        if (k>l){
            return null;
        }
        ListNode p1=head;
        ListNode p2=head;
        while (k>0){
            p1=p1.next;
            k--;
        }
        while (p1!=null){
            p1=p1.next;
            p2=p2.next;
        }
        return  p2;
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
        ListNode p1=new ListNode(1);
        ListNode p2=new ListNode(2);
        ListNode p3=new ListNode(3);
        ListNode p4=new ListNode(4);
        p1.next=p2;
        p2.next=p3;
        p3.next=p4;
        FindKthToTail find=new FindKthToTail();
       ListNode result=find.FindKthToTail(p1,3);
      System.out.print(result.val);
    }
}
