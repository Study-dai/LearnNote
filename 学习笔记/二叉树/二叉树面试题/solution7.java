package packageOJ;
//判断一个二叉树是否是平衡二叉树
public class solution7 {
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int a=maxDepth1(root.left);
        int b=maxDepth1(root.right);
        if(Math.abs(a-b)<2&&
                isBalanced(root.left)&&
                isBalanced(root.right)){
            return true;
        }
        return false;
    }
    public int maxDepth1(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int left_height = maxDepth1(root.left);
            int right_height = maxDepth1(root.right);
            return java.lang.Math.max(left_height, right_height) + 1;
        }
    }
}
