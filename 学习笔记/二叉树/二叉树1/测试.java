 public static void main(String[] args) {
        BinnaryTree binnaryTree =new BinnaryTree();
        Node root=binnaryTree.bulidtree();
        //ǰ�����
        binnaryTree.preOrderTrversal(root);
        System.out.println();
        //�������
        binnaryTree.inOrderTraversal(root);
        System.out.println();
        //�������
        binnaryTree.postOrderTraversal(root);
        System.out.println();
        //������
        System.out.println(binnaryTree.getSize2(root));
        //��Ҷ�ӽ����
        System.out.println(binnaryTree.getLeafSize1(root));

    }

ִ�н����
A B D E H C F G 
D B E H A F C G 
D H E B F G C A 
8
4
 