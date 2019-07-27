package 数组;

import java.util.Arrays;

public class MoreThanHalfNum {
    public int MoreThanHalfNum(int [] arr){
        Arrays.sort(arr);
        int len=arr.length;
        int n=len/2;
        int count=0;
        for(int i=0;i<len;i++){
         if (arr[n]==arr[i])
             count++;
        }
        if (count<=n)
            return 0;
        return arr[n];
    }
    public static void main(String [] args){
        int [] arr={8,3,2,2,2};
        MoreThanHalfNum m=new MoreThanHalfNum();
        int result=m.MoreThanHalfNum(arr);
        System.out.print(result);
    }
}
