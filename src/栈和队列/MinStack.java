package 栈和队列;

import java.util.Stack;

public class MinStack {
    Stack<Integer> s1=new Stack<Integer>();
    Stack<Integer> s2=new Stack<Integer>();
    public void push(int  k){
        s1.push(k);
        if (s2.isEmpty()||s2.peek()>k){
            s2.push(k);
        }else {
            s2.push(s2.peek());
        }
    }
    public void pop(){
        s1.pop();
        s2.pop();
    }
}
