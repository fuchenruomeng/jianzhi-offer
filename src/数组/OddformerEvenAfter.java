package 数组;

public class OddformerEvenAfter {
    public void OddformerEvenAfter(int [] arr){
        int len=arr.length;
        for (int i=0;i<len;i++){
            boolean flag=false;
            for (int j=0;j<len-i-1;j++){
                if (arr[j]%2==0&&arr[j+1]%2==1){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if (!flag) break;
        }
    }
    public  static void main(String []args){
        int []arr={1,2,3,4,5};
        OddformerEvenAfter o=new OddformerEvenAfter();
        o.OddformerEvenAfter(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
