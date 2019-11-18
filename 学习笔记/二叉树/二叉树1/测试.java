 public static void main(String[] args) {
        BinnaryTree binnaryTree =new BinnaryTree();
        Node root=binnaryTree.bulidtree();
        //前序遍历
        binnaryTree.preOrderTrversal(root);
        System.out.println();
        //中序遍历
        binnaryTree.inOrderTraversal(root);
        System.out.println();
        //后序遍历
        binnaryTree.postOrderTraversal(root);
        System.out.println();
        //结点个数
        System.out.println(binnaryTree.getSize2(root));
        //求叶子结点数
        System.out.println(binnaryTree.getLeafSize1(root));

    }
/*执行结果：
A B D E H C F G 
D B E H A F C G 
D H E B F G C A 
8
4
 */