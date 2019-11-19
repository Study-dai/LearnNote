package packageOJ;
import java.util.*;
//二叉树的前序遍历非递归实现
public class solution1 {
    public List<Integer> preorderTraversal(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null) {
            return output;
        }
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pollLast();
            output.add(node.val);

            if(node.right!=null){
                stack.add(node.right);
            }
            if(node.left!=null){
                stack.add(node.left);
            }
        }
        return output;
    }
    //递归实现
    public List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> list=new LinkedList<>();
        if(root==null){
            return list;
        }
        System.out.println(root.val+" ");
        list.add(root.val);
        List<Integer>left= preorderTraversal2(root.left);
        list.add(root.val);
        List<Integer>right=preorderTraversal2(root.right);
        return list;

    }
}