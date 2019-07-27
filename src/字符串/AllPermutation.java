package 字符串;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AllPermutation {
    //1.无重复字符全排列
    //2.有重复字符全排列
    public ArrayList<String> Permutation(String s){
        char [] arr=s.toCharArray();
        ArrayList<String> list=new ArrayList<String>();
        core(arr,list,0);
        return list;
    }
    public void core(char [] arr,ArrayList<String> list,int i){
        if(i==arr.length-1){
            list.add(String.valueOf(arr));
        }else {
            Set<Character> set=new HashSet<Character>();
            for(int j=i;j<arr.length;j++){
                if(!set.contains(arr[j])) {
                    set.add(arr[j]);
                    swap(arr, i, j);
                    core(arr, list, i + 1);
                    swap(arr, i, j);
                }
            }
        }
    }
    public void swap(char [] arr,int i,int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String [] args){
        String s="aba";
        AllPermutation a=new AllPermutation();
        ArrayList<String> list=a.Permutation(s);
        System.out.print(list);
    }
}
