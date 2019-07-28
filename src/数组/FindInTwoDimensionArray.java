package 数组;

public class FindInTwoDimensionArray {
    public boolean Find(int [][]arr,int target){
        int len=arr.length-1;
        int i=0;
        while (len>=0&&i<arr[1].length){
            if (arr[len][i]>target){
               len--;
            }else if (arr[len][i]<target){
                i++;
            }else {
                return true;
            }
        }
        return false;
    }
    public static void main(String [] args){
        int [][]arr={{1,2,3},{2,3,4},{3,4,5}};
        FindInTwoDimensionArray f=new FindInTwoDimensionArray();
        boolean flag=f.Find(arr,5);
        System.out.print(flag);
    }
}
