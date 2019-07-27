package 栈和队列;

import java.util.Stack;

public class PushAndPopMate {
    public boolean PushAndPopMate(int [] push,int [] pop){
        Stack<Integer> s=new Stack<Integer>();
        int index=0;
        for(int i=0;i<push.length;i++){
            s.push(push[i]);
            while (!s.isEmpty()&&s.peek()==pop[index]){
                s.pop();
                index++;
            }
        }
        return s.isEmpty();
    }
    public  static void main(String [] args){
        int [] push={1,2,3,4,5};
        int [] pop={5,4,3,2,1};
        PushAndPopMate p=new PushAndPopMate();
        System.out.print(p.PushAndPopMate(push,pop));
    }
}
