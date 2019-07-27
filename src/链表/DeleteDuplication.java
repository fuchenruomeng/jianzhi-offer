package 链表;

public class DeleteDuplication {
    public ListNode DeleteDuplication(ListNode phead) {
        if (phead == null || phead.next == null)
            return phead;
        if (phead.val == phead.next.val) {
            ListNode pnode = phead.next;
            while (pnode.val == phead.val&&pnode!=null) {
                pnode = pnode.next;
            }
            return  DeleteDuplication(pnode);
        } else {
            phead.next = DeleteDuplication(phead.next);
        }
        return  phead;
    }
    public static void main(String [] args){
        ListNode p1=new ListNode(1);
        ListNode p2=new ListNode(2);
        ListNode p3=new ListNode(2);
        ListNode p4=new ListNode(4);
        p1.next=p2;
        p2.next=p3;
        p3.next=p4;
        DeleteDuplication d=new DeleteDuplication();
        ListNode p=d.DeleteDuplication(p1);
        while (p!=null){
            System.out.print(p.val);
            p=p.next;
        }
    }
}

