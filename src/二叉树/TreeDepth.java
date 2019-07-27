package 二叉树;

public class TreeDepth {
    public int TreeMaxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int lefthight=TreeMaxDepth(root.left);
        int righthight=TreeMaxDepth(root.right);
        return  (lefthight>righthight?lefthight:righthight)+1;
    }
    public int TreeMinDepth(TreeNode root){
        if (root==null){
            return 0;
        }
        if(root.left==null||root.right==null){
            return 1;
        }
        int lefthight=TreeMinDepth(root.left);
        int righthight=TreeMinDepth(root.right);
        return (lefthight<righthight?lefthight:righthight)+1;
    }
    public  static void main(String [] args){
        TreeNode t1=new TreeNode(1);
        TreeNode t2=new TreeNode(2);
        TreeNode t3=new TreeNode(3);
        TreeNode t4=new TreeNode(4);
        TreeNode t5=new TreeNode(5);
        t1.left=t2;
        t1.right=t3;
        t2.right=t5;
        t2.left=t4;
        TreeDepth tree=new TreeDepth();
        int result1=tree.TreeMaxDepth(t1);
        System.out.print(result1);
        int result2=tree.TreeMinDepth(t1);
        System.out.print(result2);
    }
}
