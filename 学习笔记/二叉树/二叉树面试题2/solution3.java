package packageOJ2;
//给定一个结点，找到该树中两个指定结点的公共祖先
//思路：1、判断根节点是不是p或者q当中任意一个结点，如果是，根节点就是你的祖先
//2、根节点不是p或者q 分别去左子树和右树找
//3、从左树和右树找完之后
//A：p  q都在左树   B:p q都在右树

//a:p、q分别在作左右树中
//根节点
//b:p、q在左树
//最先找到的那个结点就是最近的公共祖先
//c:p、q在右树
//最先找到的那个结点就是最近公共祖先

public class solution3 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if(root==p||root==q){
            return root;
        }
        TreeNode leftNode= lowestCommonAncestor(root.left,p,q);
        TreeNode rightNode= lowestCommonAncestor(root.right,p,q);
        if(leftNode!=null&&rightNode!=null){
            return root;
        }
        if(leftNode!=null){
            return leftNode;
        }
        if(rightNode!=null){
            return rightNode;
        }
        return null;
    }
}
