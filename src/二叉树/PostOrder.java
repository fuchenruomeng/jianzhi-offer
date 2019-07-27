package 二叉树;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class PostOrder{
    static  ArrayList<Integer> list=new ArrayList<Integer>();
    public void PostOrderRecursion(TreeNode root){
        if (root==null)
            return;
        if (root.left!=null){
            PostOrderRecursion(root.left);
        }
        if (root.right!=null){
            PostOrderRecursion(root.right);
        }
        list.add(root.val);
    }
    public  void PostOrderNoRecursion(TreeNode root){
        Stack<TreeNode> s=new Stack<TreeNode>();
        s.add(root);
        while (!s.isEmpty()){
            TreeNode pop=s.pop();
            list.add(pop.val);
            if (pop.left!=null){
                s.add(pop.left);
            }
            if (pop.right!=null){
                s.add(pop.right);
            }
        }
        Collections.reverse(list);
        for (int i=0;i<list.size()/2;i++){
            System.out.print(list.get(i)+" ");
        }
    }
    public  static void main(String [] args){
        TreeNode t1=new TreeNode(1);
        TreeNode t2=new TreeNode(2);
        TreeNode t3=new TreeNode(3);
        t1.left=t2;
        t1.right=t3;
        PostOrder p=new PostOrder();
        p.PostOrderRecursion(t1);
        System.out.print(list);
        p.PostOrderNoRecursion(t1);
    }
}
