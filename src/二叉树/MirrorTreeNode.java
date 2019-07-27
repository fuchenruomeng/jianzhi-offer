package 二叉树;

public class MirrorTreeNode {
    //二叉树的镜像
    public void Mirror(TreeNode root){
        if (root.left==null&&root.right==null){
            return;
        }
        TreeNode temp;
        temp=root.left;
        root.left=root.right;
        root.right=temp;
        if(root.left!=null){
            Mirror(root.left);
        }
        if (root.right!=null){
            Mirror(root.right);
        }
    }
    //若为镜像即对称
    public boolean IsSymmetric(TreeNode root){
        if(root==null)
            return true;
        return LeftRightSymmetric(root.left,root.right);
    }
    public boolean LeftRightSymmetric(TreeNode left,TreeNode right){
        if (left==null&&right==null) return  true;
        if (left==null||right==null) return  false;
        if (left.val!=right.val) {
            return  false;
        }else {
            return  LeftRightSymmetric(left.left,right.right)&&LeftRightSymmetric(left.right,right.left);
        }
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
        MirrorTreeNode m=new MirrorTreeNode();
        m.Mirror(t1);
        System.out.print(t1.right.left.val);
    }
}
