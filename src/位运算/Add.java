package 位运算;
public class Add {
    public  int Add(int sum1,int sum2){
        int sum;
        int carry;
        while (sum2!=0) {
            sum = sum1 ^ sum2;
            carry = (sum1 & sum2) << 1;
            sum1 = sum;
            sum2 = carry;
        }
        return sum1;
    }
    public static void main(String [] args){
        Add a=new Add();
        System.out.print(a.Add(3,4));
    }
}
