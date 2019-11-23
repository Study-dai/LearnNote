package packageOJ;
import java.util.*;
//二叉树的中序遍历
public class solution2 {
       public List<Integer> inorderTraversal(TreeNode root) {
           List<Integer> list=new LinkedList<>();
           if(root==null){
               return list;
           }
           list.add(root.val);
           List<Integer>left= inorderTraversal(root.left);
           System.out.println(root.val+" ");
           list.add(root.val);
           List<Integer>right=inorderTraversal(root.right);
           return list;
        }
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
}
