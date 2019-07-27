package 数组;

public class MinNumberInRotateArray {
    //二分查找变形
    public int MinNumberInRotateArray(int [] arr){
        int start=0;
        int end=arr.length-1;
        while (arr[start]>=arr[end]){
            if(start+1==end){
              break;
            }
            int mid=(start+end)/2;
            if(arr[mid]>=arr[start]){
                start=mid;
            }
            if(arr[mid]<=arr[end]){
                end=mid;
            }
        }
        return arr[end];
    }
    public  static void main(String []args){
        int [] arr={3,4,5,1,2};
        MinNumberInRotateArray m=new MinNumberInRotateArray();
        int result=m.MinNumberInRotateArray(arr);
        System.out.print(result);
    }
}
