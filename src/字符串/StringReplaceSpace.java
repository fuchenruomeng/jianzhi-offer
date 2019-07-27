package 字符串;

public class StringReplaceSpace {
    public String StringReplaceSpace(String str){
           int len=str.length();
           StringBuffer s=new StringBuffer();
           for(int i=0;i<len;i++){
               if (str.charAt(i) ==' '){
                   s.append("%");
               }else {
                   s.append(str.charAt(i));
               }
           }
           return s.toString();
    }
    public  static void main(String [] args){
        String str="wo shi song lei";
        StringReplaceSpace s=new StringReplaceSpace();
        String re=s.StringReplaceSpace(str);
        System.out.print(re);
    }
}
