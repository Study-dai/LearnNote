package packageOJ;

//判断一个二叉树是否是对称二叉树
public class solution8 {
    public boolean isSymmetricChild(TreeNode LeftTree,TreeNode RightTree){
        if(LeftTree==null&&RightTree!=null||LeftTree!=null&&RightTree==null){
            return false;
        }
        if(LeftTree==null&&RightTree==null){
            return true;
        }
        return (LeftTree.val==RightTree.val)&&
                isSymmetricChild(LeftTree.left,RightTree.right)&&
                isSymmetricChild(LeftTree.right,RightTree.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return isSymmetricChild(root.left, root.right);
    }
}
