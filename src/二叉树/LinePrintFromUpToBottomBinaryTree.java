package 二叉树;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinePrintFromUpToBottomBinaryTree {
    public ArrayList<ArrayList<Integer>> LinePrintFromUpToBottomBinaryTree(TreeNode root){
        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
        LinkedList<TreeNode> deque=new LinkedList<TreeNode>();
        deque.offer(root);
        while (!deque.isEmpty()){
            int count=0;
            int length=deque.size();
            ArrayList<Integer> temp=new ArrayList<Integer>();
            while (count<length){
                TreeNode pop=deque.pop();
                temp.add(pop.val);
                count++;
                if (pop.left!=null){
                    deque.offer(pop.left);
                }
                if (pop.right!=null) {
                    deque.offer(pop.right);
                }
            }
            list.add(temp);
        }
        return list;
    }
    public  static  void  main(String [] args){
        TreeNode t1=new TreeNode(1);
        TreeNode t2=new TreeNode(2);
        TreeNode t3=new TreeNode(3);
        TreeNode t4=new TreeNode(4);
        TreeNode t5=new TreeNode(5);
        t1.left=t2;
        t1.right=t3;
        t2.right=t5;
        t2.left=t4;
        LinePrintFromUpToBottomBinaryTree l=new LinePrintFromUpToBottomBinaryTree();
        ArrayList<ArrayList<Integer>> list=l.LinePrintFromUpToBottomBinaryTree(t1);
        System.out.print(list);
    }
}
