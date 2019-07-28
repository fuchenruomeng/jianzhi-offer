package 数组;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class GetMinKNumber {
    public ArrayList<Integer> GetMinKNumber(int [] arr,int k){
        ArrayList<Integer> list=new ArrayList<Integer>();
        int len=arr.length;
        PriorityQueue<Integer> maxheap=new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for(int i=0;i<len;i++){
           if (maxheap.size()<k){
               maxheap.offer(arr[i]);
           }else if (maxheap.peek()>arr[i]){
               Integer poll=maxheap.poll();
               maxheap.offer(arr[i]);
           }
        }
        for(Integer key:maxheap){
            list.add(key);
        }
        return list;
    }
    public static void main(String [] args){
        int [] arr={8,4,6,3};
        GetMinKNumber g=new GetMinKNumber();
        ArrayList<Integer> list=g.GetMinKNumber(arr,2);
        System.out.print(list);
    }
}
