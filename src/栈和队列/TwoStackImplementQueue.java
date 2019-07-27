package 栈和队列;

import java.util.Stack;
public class TwoStackImplementQueue {
    Stack<Integer> s1=new Stack<Integer>();
    Stack<Integer> s2=new Stack<Integer>();
    public void push(int k){
        s1.push(k);
    }
    public int pop(){
        if (s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        int pop=s2.pop();
        return pop;
    }
}
