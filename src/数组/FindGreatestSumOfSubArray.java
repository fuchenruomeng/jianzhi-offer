package 数组;

public class FindGreatestSumOfSubArray {
    public int FindGreatestSunOfSubArray(int [] arr){
        int max=0;//记录包含末尾值子数组最大值
        int res=0;//记录所有子数组最大值
        for(int i=1;i<arr.length;i++){
            max=Math.max(max+arr[i],arr[i]);
            res=Math.max(res,max);
        }
        return res;
    }
    public static void main(String [] args){
        int [] arr={6,-3,-2,7,-15,1,2,2};
        FindGreatestSumOfSubArray f=new FindGreatestSumOfSubArray();
        int re=f.FindGreatestSunOfSubArray(arr);
        System.out.print(re);
    }
}
