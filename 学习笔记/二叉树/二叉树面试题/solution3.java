package packageOJ;
import java.util.*;
public class solution3 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new LinkedList<>();
        if(root==null){
            return list;
        }
        list.add(root.val);
        List<Integer>left= postorderTraversal(root.left);
        list.add(root.val);
        List<Integer>right=postorderTraversal(root.right);
        System.out.println(root.val+" ");
        return list;
    }
 //∑«µ›πÈ µœ÷
    public List<Integer> postorderTraversal2(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        /*if (root == null) {
            return output;
        }
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pollLast();
            output.addFirst(node.val);
            if (node.left != null) {
                stack.add(node.left);
            }
            if (node.right != null) {
                stack.add(node.right);
            }
        }*/
        TreeNode cur=stack.peek();
        if(cur.right==null){
            System.out.println(cur.val);
           stack.pop();
           cur=null;
        }else{
            cur=cur.right;
        }
        return output;
    }
}
