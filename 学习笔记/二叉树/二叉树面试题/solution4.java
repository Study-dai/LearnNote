package packageOJ;
//检查两棵树是否相同
public class solution4 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //p和q是两个二叉树的根节点
        if (p == null && q == null) {//都为空说明相同
            return true;
        }
        if (p == null || q == null) {//其中有一个不为空说明不同
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
