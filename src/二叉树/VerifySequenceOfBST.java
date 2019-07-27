package 二叉树;

public class VerifySequenceOfBST {
    public boolean VerifySEquenceOfBST(int [] arr){
          int start=0;
          int end=arr.length-1;
          return IsBST(arr,start,end);
    }
    public boolean IsBST(int [] arr, int start,int end){
        if(end<=start)
            return true;
        int i=start;
        for(;i<end;i++){
            if (arr[i]>arr[end])
                break;
        }
        for(int j = i; j<end; j++){
            if(arr[j]<arr[end])
                return  false;
        }
        return  IsBST(arr,start,i-1)&&IsBST(arr,i,end-1);
    }
    public static void main(String [] args){
        int [] arr={1,3,5,4};
        VerifySequenceOfBST v=new VerifySequenceOfBST();
        System.out.print(v.VerifySEquenceOfBST(arr));
    }
}
