package 排序;

public class Sort {
    //冒泡排序
      public void BubbleSort(int [] arr){
          int len=arr.length;
          for (int i=0;i<len-1;i++){
              boolean flag=true;
              for (int j=0;j<len-1-i;j++){
                  if(arr[j]>arr[j+1]){
                      int temp=arr[j];
                      arr[j]=arr[j+1];
                      arr[j+1]=temp;
                      flag=false;
                  }
              }
              if(flag)
                  break;
          }
      }
      //选择排序
      public void SelectSort(int [] arr){
          for(int i=0;i<arr.length;i++){
              int min=i;
              for(int j=i+1;j<arr.length;j++){
                  if (arr[j]<arr[min])
                      min=j;
              }
              int temp=arr[min];
              arr[min]=arr[i];
              arr[i]=temp;
          }
      }
      //插入排序
    public void InsertSort(int [] arr){
         int j;
          for(int i=1;i<arr.length;i++){
              if(arr[i]<arr[i-1]){
                  int temp=arr[i];
                  for ( j=i-1;j>=0&&arr[j]>temp;j--){
                      arr[j+1]=arr[j];
                  }
                  arr[j+1]=temp;
              }
          }
    }
    //希尔排序
    public void ShellSort(int [] arr){
          int increment=arr.length/2;
          while (increment>=1){
              for (int i=increment;i<arr.length;i++){
                  if (arr[i]<arr[i-increment]){
                      int temp=arr[i];
                      int j=0;
                      for(j=i-increment;j>=0&&arr[j]>temp;j-=increment){
                          arr[j+increment]=arr[j];
                      }
                      arr[j+increment]=temp;
                  }
              }
              increment=increment/2;
          }
    }
      //归并排序
      public void MergeSort(int [] arr){
          int start=0;
          int end=arr.length-1;
          int [] temp = new int[arr.length];
          Sort(arr,start,end,temp);
      }
      public void Sort(int [] arr,int start,int end,int [] temp){
          if(end<=start)
              return;
          int mid=(start+end)/2;
          if (start<end) {
              Sort(arr, start, mid, temp);
              Sort(arr, mid + 1, end, temp);
              Merge(arr, start, mid, end, temp);
          }
      }
      public void Merge(int []arr,int start,int mid,int end,int [] temp) {
          int i = start;
          int j = mid + 1;
          int k = 0;
          while (i <= mid && j <= end) {
              if (arr[i] < arr[j]) {
                  temp[k++] = arr[i++];
              } else {
                  temp[k++] = arr[j++];
              }
          }
          while (i<=mid){
              temp[k++]=arr[i++];
          }
          while (j<=end){
              temp[k++]=arr[j++];
          }
          for (int n=0;n<k;n++){
              arr[start+n]=temp[n];
          }
      }
      //快速排序
    public void  Quick(int []arr){
          int start=0;
          int end=arr.length-1;
          QuickSort(arr,start,end);
    }
     public void QuickSort(int [] arr,int start,int end){
          if(start>end)
              return;
          int index=Partition(arr,start,end);
          QuickSort(arr,start,index-1);
          QuickSort(arr,index+1,end);
     }
     public int Partition(int [] arr,int start,int end){
          int left=start;
          int right=end;
          int base=arr[start];
          while (left<right){
              while (left<right&&arr[right]>=base){
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
    //堆排序<小顶堆>
      public void HeapSort(int [] arr){
          //1.构造堆
          for(int i=arr.length/2-1;i>=0;i--){
          AdjustHeap(arr,i,arr.length);
          }
          //2.首位元素互换，调整堆
          for(int j=arr.length-1;j>0;j--){
              int temp=arr[0];
              arr[0]=arr[j];
              arr[j]=temp;
              AdjustHeap(arr,0,j);
          }
      }
      public void AdjustHeap(int [] arr, int i,int length) {
          int temp = arr[i];
          for (int k = 2 * i + 1; k < length; k = 2 * k + 1) {
              if (k+1 < length && arr[k] >arr[k + 1]) {
                  k++;
              }
              if (arr[k] < temp) {
                  arr[i] = arr[k];
                  i = k;
              } else {
                  break;
              }
          }
          arr[i]=temp;
      }
      public static void main(String [] args){
          int [] arr={4,3,2,1};
          Sort s=new Sort();
          //s.BubbleSort(arr);
          //s.SelectSort(arr);
        //  int [] temp=new int[4];
        // s.MergeSort(arr);
         // s.Quick(arr);
       //   s.HeapSort(arr);
         // s.InsertSort(arr);
          s.ShellSort(arr);
          for(int i=0;i<arr.length;i++){
              System.out.print(arr[i]+" ");
          }
      }
}
