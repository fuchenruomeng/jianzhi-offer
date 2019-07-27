package 二叉树;

public class IsBalancedBinaryTree {
    public  boolean IsBalancedBinaryTree(TreeNode root){
        TreeDepth depth=new TreeDepth();
        if (root==null)
            return  true;
        if (Math.abs(depth.TreeMaxDepth(root.left)-depth.TreeMaxDepth(root.right))>1)
            return false;
        return  IsBalancedBinaryTree(root.left)&&IsBalancedBinaryTree(root.right);
    }
    public static void  main(String [] args){
        TreeNode t1=new TreeNode(4);
        TreeNode t2=new TreeNode(2);
        TreeNode t3=new TreeNode(5);
        TreeNode t4=new TreeNode(1);
        TreeNode t5=new TreeNode(3);
        t1.left=t2;
        t1.right=t3;
        t2.left=t4;
        t4.right=t5;
        IsBalancedBinaryTree i=new IsBalancedBinaryTree();
        System.out.print(i.IsBalancedBinaryTree(t1));
    }
}
