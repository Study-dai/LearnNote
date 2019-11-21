package packageOJ2;


//二叉搜索树转换成排序双向链表
//left表示前驱  right表示后继
//中序遍历二叉搜索树
public class solution4 {
    public TreeNode prev=null;
    public void ConvertChild(TreeNode root){
        if(root==null){
            return ;
        }
        ConvertChild(root.left);
        root.left=prev;
        if(prev!=null){
            prev.right=root;
        }
        prev=root;
        ConvertChild(root.right);
    }
    public TreeNode Convert(TreeNode pRootOfTree) {
        ConvertChild(pRootOfTree);
        TreeNode head=pRootOfTree;
        while(head!=null||head.left!=null){
            head=head.left;
        }
        return head;
    }
}
