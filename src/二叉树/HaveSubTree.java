package 二叉树;

import 二叉树.TreeNode;

public class HaveSubTree {
    public  boolean HaveSubTree(TreeNode t1, TreeNode t2){
        boolean result=false;
        if (t1.val==t2.val){
            result=T1IncludeT2(t1,t2);
        }
        if(!result){
            result=HaveSubTree(t1.left,t2);
        }
        if (!result){
            result=HaveSubTree(t1.right,t2);
        }
        return  result;
    }
    public boolean T1IncludeT2(TreeNode t1,TreeNode t2){
        if(t2==null) return  true;
        if (t1==null)return  false;
        if (t1.val!=t2.val) return  false;
        return T1IncludeT2(t1.left,t2.left)&&T1IncludeT2(t1.right,t2.right);
    }
}
