package 位运算;

public class NumberOf1 {
    public int NumberOf1(int n){
        int count=0;
        while(n!=0){
            n=(n-1)&n;
            count++;
        }
      return  count;
    }
    public static void main(String [] args){
        NumberOf1 a=new NumberOf1();
        int result=a.NumberOf1(111);
        System.out.print(result);
    }
}
