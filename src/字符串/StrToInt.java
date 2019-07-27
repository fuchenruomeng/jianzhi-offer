package 字符串;

public class StrToInt {
    public int StrToInt(String str){
        char [] c=str.toCharArray();
        int sum=0;
        if (c[0]=='-'){
            for (int i=1;i<c.length;i++){
                if (c[i]=='+')
                    continue;
                if (c[i]<48||c[i]>57)
                    return 0;
                sum=sum*10+c[i]-48;
            }
            return sum*(-1);
        }else {
            for (int i=0;i<c.length;i++){
                if (c[i]=='+')
                    continue;
                if (c[i]<48||c[i]>57)
                    return 0;
                sum=sum*10+c[i]-48;
            }
            return  sum;
        }
    }
    public  static void main(String [] args){
        String str="a123";
        StrToInt s=new StrToInt();
        int result=s.StrToInt(str);
        System.out.print(result);
    }
}
