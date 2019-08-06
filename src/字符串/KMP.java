package 字符串;

public class KMP {
    //朴素算法（暴力解法）
    public int VoilenceIdexOf(String source,String pattern){
        char [] src=source.toCharArray();
        char [] pat=pattern.toCharArray();
        int Slen=src.length;
        int Plen=pat.length;
        int i=0;
        int j=0;
        while (i<Slen&&j<Plen){
            if (src[i]==pat[j]){
                i++;
                j++;
            }else {
                i=i-j+1;
                j=0;
            }
        }
        if (j==Plen){
         return i-j;
        }
        return -1;
    }
    //KMP
    public int KmpIndexOf(String source,String pattern){
        char [] src=source.toCharArray();
        char [] pat=pattern.toCharArray();
        int Slen=src.length;
        int Plen=pat.length;
        int i=0;
        int j=0;
        int [] next=Goodnext(pat);
        while (i<Slen&&j<Plen){
            if (j==-1||src[i]==pat[j]){
                i++;
                j++;
            }else {
               j=next[j];
            }
        }
        if (j==Plen){
            return i-j;
        }
        return -1;
    }
    //next数组
    public int [] next(char [] p){
        // 已知next[j] = k,利用递归的思想求出next[j+1]的值
        // 如果已知next[j] = k,如何求出next[j+1]呢?具体算法如下:
        // 1. 如果p[j] = p[k], 则next[j+1] = next[k] + 1;
        // 2. 如果p[j] != p[k], 则令k=next[k],如果此时p[j]==p[k],则next[j+1]=k+1,
        // 如果不相等,则继续递归前缀索引,令 k=next[k],继续判断,直至k=-1(即k=next[0])或者p[j]=p[k]为止
        int j=0;//后缀
        int k=-1;//前缀
        int [] next=new int [p.length];
        next[0]=-1;
        while (j <p.length-1){
            if (k==-1||p[j]==p[k]){
                k++;
                j++;
                next[j]=k;
            }else {
                k=next[k];
            }
        }
        return next;
    }
    //优化的next数组
    public int [] Goodnext(char [] p){
        int j=0;//后缀
        int k=-1;//前缀
        int [] next=new int [p.length];
        next[0]=-1;
        while (j <p.length-1){
            if (k==-1||p[j]==p[k]){
                k++;
                j++;
                // 修改next数组求法
                if (p[j] != p[k]) {
                    next[j] = k;// next中只有这一行
                } else {
                    // 不能出现p[j] = p[next[j]],所以如果出现这种情况则继续递归,如 k = next[k],
                    // k = next[[next[k]]
                    next[j] = next[k];
                }
            }else {
                k=next[k];
            }
        }
        return next;
    }
    public static void main(String [] args){
        String source="abcdefr";
        String pattern="fr";
        KMP k=new KMP();
       //int index= k.VoilenceIdexOf(source,pattern);
        int index=k.KmpIndexOf(source,pattern);
       System.out.print(index);
    }
    }

