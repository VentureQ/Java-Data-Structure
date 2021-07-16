package 二叉树层序遍历;

import java.util.ArrayList;
import java.util.LinkedList;

//public class test.Solution{
//    class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//        TreeNode(int x) { val = x; }
//    }
//    public static void LaywerTraversal(TreeNode root){
//        if(root==null) return;
//        LinkedList<TreeNode> list = new LinkedList<TreeNode>();
//        list.add(root);
//        TreeNode currentNode;
//        while(!list.isEmpty()){
//            currentNode=list.poll();
//            System.out.println(currentNode.val);
//            if(currentNode.left!=null){
//                list.add(currentNode.left);
//            }
//            if(currentNode.right!=null){
//                list.add(currentNode.right);
//            }
//        }
//    }
//}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

public class Solution {

        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
            if (pRoot == null) return list;
            count(pRoot, 0);
            return list;
        }


        //一个向下探索的递归方法
        public void count(TreeNode node, int level) {
            if (level == list.size()) {
                list.add(new ArrayList<Integer>());
            }
            ArrayList<Integer> list1 = list.get(level);
            list1.add(node.val);

            if (node.left != null) {
                count(node.left, level + 1);
            }
            if (node.right != null) {
                count(node.right, level + 1);
            }
        }

    }
}