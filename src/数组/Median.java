package 数组;

public class Median {
    public int Median(int [] arr){
        int len=arr.length;
        int mid;
        if (len%2==0){
             mid=(Mid(arr,len/2)+Mid(arr,(len/2)-1))/2;
        }else {
             mid=Mid(arr,len/2);
        }
        return mid;
    }
    public int Mid(int [] arr,int k){
        int val=0;
        int low=0;
        int high=arr.length-1;
        while (low<high) {
            int index = Partition(arr, low, high);
            if (index == k) {
                val = arr[index];
                break;
            } else if (index > k) {
                  high=index-1;
            } else {
                 low=index+1;
            }
        }
        return val;
    }
    public int Partition(int [] arr,int start,int end){
        int left=start;
        int right=end;
        int base=arr[start];
        while(left<right){
            while (left<right&&arr[right]>base){
                right--;
            }
            while (left<right&&arr[left]<=base){
                left++;
            }
         if(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
         }
        }
        arr[start]=arr[left];
        arr[left]=base;
        return left;
    }
    public static void main(String [] args){
        int [] arr={3,3,3,3,6};
        Median m=new Median();
        int re=m.Median(arr);
        System.out.print(re);
    }
}
