package 数组;

import java.util.ArrayList;
import java.util.Collections;

public class MaxInWindow {
    public ArrayList<Integer> MaxInWindow(int [] arr,int size){
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<=arr.length-size;i++){
            ArrayList<Integer> temp=new ArrayList<Integer>();
            for(int j=i;j<i+size;j++){
                temp.add(arr[j]);
            }
            Collections.sort(temp);
            list.add(temp.get(temp.size()-1));
        }
        return list;
    }
    public static void main(String [] args){
        int [] arr={2,3,4,2,6,2,5,1};
        MaxInWindow m=new MaxInWindow();
        ArrayList<Integer> list=m.MaxInWindow(arr,3);
        System.out.print(list);
    }
}
