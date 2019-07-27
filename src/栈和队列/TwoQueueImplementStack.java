package 栈和队列;

import java.util.LinkedList;
import java.util.Queue;

public class TwoQueueImplementStack {
    Queue<Integer> q1=new LinkedList<Integer>();
    Queue<Integer> q2=new LinkedList<Integer>();
    public void push(int m){
        if(q1.isEmpty()){
            q1.offer(m);
        }
        if(q2.isEmpty()){
            q2.offer(m);
        }
    }
    public int pop(){
        if(q1.isEmpty()){
            while (q2.size()>1){
                q1.offer(q2.poll());
            }
            int pop=q2.poll();
        }else {
            while (q1.size()>1){
                q2.offer(q1.poll());
            }
            int pop=q1.poll();
        }
        return pop();
    }
}
