package 二叉树;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class PrintBinaryTree {
    //从上往下打印，每行从左到右
    public ArrayList<Integer> PrintFromUptoBottomBinaryTree(TreeNode root){
        ArrayList<Integer> list=new ArrayList<Integer>();
        Deque<TreeNode> deque=new LinkedList<TreeNode>();
        deque.add(root);
        while (!deque.isEmpty()) {
            TreeNode pop=deque.pop();
            list.add(pop.val);
            if (pop.left!=null) {
                deque.add(pop.left);
            }
            if (pop.right!=null) {
               deque.add(pop.right);
            }
        }
        return list;
    }
    //按照之字形顺序打印
    public ArrayList<Integer> PrintOfDifferenceLine(TreeNode root){
        ArrayList<Integer>  list=new ArrayList<Integer>();
        Stack<TreeNode> s1=new Stack<TreeNode>();
        Stack<TreeNode> s2=new Stack<TreeNode>();
        s1.add(root);
        while (!s1.isEmpty()||!s2.isEmpty()) {
            while (!s1.isEmpty()) {
                TreeNode pop = s1.pop();
                list.add(pop.val);
                if (pop.left != null) {
                    s2.push(pop.left);
                }
                if (pop.right != null) {
                    s2.push(pop.right);
                }
            }
            while (!s2.isEmpty()){
                TreeNode pop=s2.pop();
                list.add(pop.val);
                if(pop.right!=null){
                    s1.push(pop.right);
                }
                if (pop.left!=null){
                    s1.push(pop.left);
                }
            }
        }
        return list;
    }
    //打印成多行，每行从左到右
    public ArrayList<ArrayList<Integer>> PrintMoreLine(TreeNode root) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        Deque<TreeNode> deque = new LinkedList<TreeNode>();
        deque.add(root);
        int count;
        int last;
        while (!deque.isEmpty()) {
            count = 0;
            last = deque.size();
            ArrayList<Integer> tmp=new ArrayList<Integer>();
            while (count < last) {
               TreeNode  pop = deque.pop();
                tmp.add(pop.val);
                count++;
                if (pop.left != null) {
                    deque.add(pop.left);
                }
                if (pop.right != null) {
                    deque.add(pop.right);
                }
            }
            list.add(tmp);
        }
        return list;
    }

    public  static  void main(String [] args){
        TreeNode t1=new TreeNode(1);
        TreeNode t2=new TreeNode(2);
        TreeNode t3=new TreeNode(3);
        TreeNode t4=new TreeNode(4);
        TreeNode t5=new TreeNode(5);
        t1.left=t2;
        t1.right=t3;
        t2.right=t5;
        t2.left=t4;
        PrintBinaryTree p=new PrintBinaryTree();
        ArrayList<Integer> list1=p.PrintFromUptoBottomBinaryTree(t1);
        System.out.print(list1);
        ArrayList<Integer> list2=p.PrintOfDifferenceLine(t1);
        System.out.print(list2);
        ArrayList<ArrayList<Integer>> list3=p.PrintMoreLine(t1);
        System.out.print(list3);
    }
}
