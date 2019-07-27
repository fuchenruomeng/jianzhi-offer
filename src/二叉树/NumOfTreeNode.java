package 二叉树;

public class NumOfTreeNode {
    public int NumOfAllTreeNode(TreeNode root) {
        if (root == null)
            return 0;
        int left = NumOfAllTreeNode(root.left);
        int right = NumOfAllTreeNode(root.right);
        return left + right + 1;
    }

    public int NumOfNoChildTreeNode(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        int left = NumOfNoChildTreeNode(root.left);
        int right = NumOfNoChildTreeNode(root.right);
        return left + right;
    }

    public int NumOfKthLevelTreeNode(TreeNode root, int k) {
        if (root == null || k < 0)
            return 0;
        if (k == 1)
            return 1;
        int left = NumOfKthLevelTreeNode(root.left, k - 1);
        int right = NumOfKthLevelTreeNode(root.right, k - 1);
        return left + right;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        t1.left = t2;
        t1.right = t3;
        t2.right = t5;
        t2.left = t4;
        NumOfTreeNode n=new NumOfTreeNode();
        System.out.print(n.NumOfAllTreeNode(t1)+" "+n.NumOfNoChildTreeNode(t1)+" "+n.NumOfKthLevelTreeNode(t1,3));
    }
}
