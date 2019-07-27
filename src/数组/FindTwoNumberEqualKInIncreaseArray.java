package 数组;

import java.util.ArrayList;
import java.util.HashMap;

public class FindTwoNumberEqualKInIncreaseArray {
    public  ArrayList<Integer> Find(int [] arr,int k){
        ArrayList<Integer> list=new ArrayList<Integer>();
        int i=0;
        int j=arr.length-1;
        while (i!=j) {
            if (arr[i] + arr[j] < k) {
                i++;
            } else if (arr[i] + arr[j] > k) {
                j--;
            } else {
                list.add(arr[i]);
                list.add(arr[j]);
                break;
            }
        }
        return  list;
    }
    public int [][] find(int [] arr,int k){
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        int [][]a=new int[2][2];
        for (int i=0;i<arr.length;i++) {
            if (map.containsKey(k - arr[i])) {
                a[0][0] = arr[i];
                a[0][1] = i;
                a[1][0] = k - arr[i];
                a[1][1] = map.get(k - arr[i]);
                return  a;
            } else {
                map.put(arr[i], i);
            }
        }
        return a;
    }
    public static void main(String [] args){
        int [] arr={1,2,3,4};
        FindTwoNumberEqualKInIncreaseArray f=new FindTwoNumberEqualKInIncreaseArray();
      //  ArrayList<Integer> list=f.Find(arr,5);
      //  System.out.print(list);
        int [][]a=new int[2][2];
        a=f.find(arr,5);
        System.out.print(a[1][0]);
    }
}
