package 数组;

public class GetNumberOfK {
    public int GetNumberOfK(int [] arr,int k){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==k)
                count++;
        }
        return  count;
    }
    public static void main(String [] args){
        int [] arr={2,1,4,5,2,3,4};
        GetNumberOfK a=new GetNumberOfK();
        int result=a.GetNumberOfK(arr,2);
        System.out.print(result);
    }

}
