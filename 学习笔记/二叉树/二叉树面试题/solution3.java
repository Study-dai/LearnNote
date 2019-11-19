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
}
