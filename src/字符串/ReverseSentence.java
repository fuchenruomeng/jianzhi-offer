package 字符串;

public class ReverseSentence {
    public String ReverseSentence(String s){
        char [] arr=s.toCharArray();
        //整体反转
        Reverse(arr,0,arr.length-1);
        int start=0;
        int end=0;
        int i=0;
       while (i<arr.length){
        while (i<arr.length&&arr[i]==' '){
            i++;
        }
        start=end=i;
        while (i<arr.length&&arr[i]!=' '){
            i++;
            end++;
        }
        //局部反转
        Reverse(arr,start,end-1);
       }
        return String.valueOf(arr);
    }
    public void Reverse(char [] arr,int start,int end){
        while (start<end){
         char temp=arr[start];
         arr[start]=arr[end];
         arr[end]=temp;
         start++;
         end--;
        }
    }
    public static void main(String [] args){
        ReverseSentence r=new ReverseSentence();
        String s="I am songlei";
        String re=r.ReverseSentence(s);
        System.out.print(re);
    }
}
