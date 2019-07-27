package 链表;

public class MergeTwoSortLinked {
    public ListNode Merge(ListNode root1, ListNode root2){
        if (root1==null) return root2;
        if (root2==null) return root1;
        ListNode root3=null;
        if (root1.val>=root2.val){
            root3=root2;
            root3.next=Merge(root1,root2.next);
        }else {
            root3=root1;
            root3.next=Merge(root1.next,root2);
        }
        return root3;
    }
    public static void main(String []args){
        ListNode t1=new ListNode(1);
        ListNode t2=new ListNode(3);
        t1.next=t2;
        ListNode t3=new ListNode(2);
        ListNode t4=new ListNode(4);
        t3.next=t4;
        MergeTwoSortLinked m=new MergeTwoSortLinked();
        ListNode re=m.Merge(t1,t3);
        while (re!=null){
            System.out.print(re.val);
            re=re.next;
        }
    }
}
