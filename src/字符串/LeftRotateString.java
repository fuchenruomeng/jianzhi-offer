package 字符串;

public class LeftRotateString {
    public String LeftRoatateString(String str,int k){
        int len=str.length();
        int m=k%len;
        StringBuffer s1=new StringBuffer(str.substring(0,m));
        StringBuffer s2=new StringBuffer(str.substring(m,len));
        StringBuffer s3=new StringBuffer(s1.reverse().toString()+s2.reverse().toString());
        return  s3.reverse().toString();
    }
    public  static void main(String [] args){
        String str="帅宋磊";
        LeftRotateString l=new LeftRotateString();
        String result=l.LeftRoatateString(str,1);
        System.out.print(result);
    }
}
