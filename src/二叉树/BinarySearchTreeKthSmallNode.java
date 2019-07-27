package 二叉树;

import java.util.ArrayList;

public class BinarySearchTreeKthSmallNode {
    ArrayList<TreeNode> list=new ArrayList<TreeNode>();
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        if(root.left!=null){
            inorder(root.left);
        }
        list.add(root);
        if (root.right!=null){
            inorder(root.right);
        }
    }
    public int BinarySearchTreeKthSmallNode(TreeNode root, int k){
        inorder(root);
        int result=list.get(k-1).val;
        return  result;
    }
    public static void main(String [] args){
        TreeNode t1=new TreeNode(1);
        TreeNode t2=new TreeNode(2);
        TreeNode t3=new TreeNode(3);
        t2.left=t1;
        t2.right=t3;
        BinarySearchTreeKthSmallNode b=new BinarySearchTreeKthSmallNode();
        int result=b.BinarySearchTreeKthSmallNode(t2,2);
        System.out.print(result);
    }
}
