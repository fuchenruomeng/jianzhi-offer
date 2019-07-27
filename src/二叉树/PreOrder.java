package 二叉树;

import java.util.ArrayList;
import java.util.Stack;

public class PreOrder {
    static ArrayList<Integer> list=new ArrayList<Integer>();
    public void PreOrderRcursion(TreeNode root){
        if (root==null)
            return;
        list.add(root.val);
        if (root.left!=null){
        PreOrderRcursion(root.left);
        }
        if (root.right!=null){
            PreOrderRcursion(root.right);
        }
    }
    public void PreOrderNonRecursion(TreeNode root){
        Stack<TreeNode> s=new Stack<TreeNode>();
        s.add(root);
        while (!s.isEmpty()){
            TreeNode t=s.pop();
            System.out.print(t.val);
            if (t.right!=null){
                s.add(t.right);
            }
            if (t.left!=null){
                s.add(t.left);
            }
        }
    }
    public static void main(String [] args){
        TreeNode t1=new TreeNode(1);
        TreeNode t2=new TreeNode(2);
        TreeNode t3=new TreeNode(3);
        t1.left=t2;
        t1.right=t3;
        PreOrder p=new PreOrder();
        p.PreOrderRcursion(t1);
        System.out.print(list);
        p.PreOrderNonRecursion(t1);
    }
}
