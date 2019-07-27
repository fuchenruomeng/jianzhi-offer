package 链表;

import java.util.ArrayList;
import  java.util.Stack;
public class PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode head){
     ArrayList<Integer> list=new ArrayList<Integer>();
     Stack<Integer> stack=new Stack<Integer>();
     ListNode p=head;
     while (p!=null) {
         stack.push(p.val);
         p = p.next;
     }
     while (!stack.isEmpty()) {
         list.add(stack.pop());
     }
     return  list;
    }
 public  static void main(String [] args){
        ListNode p1=new ListNode(1);
        ListNode p2=new ListNode(2);
        ListNode p3=new ListNode(3);
        p1.next=p2;
        p2.next=p3;
       PrintListFromTailToHead print=new PrintListFromTailToHead();
       ArrayList<Integer> list=new ArrayList<Integer>();
       list=print.printListFromTailToHead(p1);
       System.out.print(list);
 }
}
