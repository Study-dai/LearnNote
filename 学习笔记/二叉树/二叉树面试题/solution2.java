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
}
