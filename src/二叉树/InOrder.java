package 二叉树;

import java.util.ArrayList;
import java.util.Stack;

public class InOrder {
    static ArrayList<Integer> list=new ArrayList<Integer>();
    public void InOrderRecursion(TreeNode root){
        if (root==null)
            return;
        if (root.left!=null){
        InOrderRecursion(root.left);
        }
        list.add(root.val);
        if (root.right!=null){
            InOrderRecursion(root.right);
        }
    }
    public void InOrderNoRecursion(TreeNode root){
        Stack<TreeNode> s=new Stack<>();
        TreeNode p=root;
        while (!s.isEmpty()||p!=null){
            while (p!=null){
                s.add(p);
                p=p.left;
            }
            while (!s.isEmpty()){
                TreeNode pop=s.pop();
                System.out.print(pop.val+" ");
                p=pop.right;
            }
        }
    }
    public static void main(String[] args){
        TreeNode t1=new TreeNode(1);
        TreeNode t2=new TreeNode(2);
        TreeNode t3=new TreeNode(3);
        t1.left=t2;
        t1.right=t3;
        InOrder i=new InOrder();
        i.InOrderRecursion(t1);
        System.out.print(list);
        i.InOrderNoRecursion(t1);
    }
}
