public class BinnaryTree {
    //��Ϊ����һ��������
    public Node bulidtree() {
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        E.right = H;
        C.left = F;
        C.right = G;
        return A;
    }
//���ķ���

    //�ݹ�˼�룺��ֹ����+�ݹ鹫ʽ
    //ǰ�����
    void preOrderTrversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrderTrversal(root.left);
        preOrderTrversal(root.right);
    }

    //�������
    void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.println(root.val + " ");
        inOrderTraversal(root.right);

    }

    //�������
    void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.val + " ");
    }

    //����˼·-�������
    static int size = 0;

    int getSize1(Node root) {
        if (root == null) {
            return 0;
        }
        size++;
        getSize1(root.left);
        getSize1(root.right);
        return size;
    }

    //������˼·-�������
    int getSize2(Node root) {
        if (root == null) {
            return 0;
        }
        return getSize2(root.left)
                + getSize2(root.right) + 1;
    }

    //����˼·-��Ҷ�ӽ�����
    static int leafSize = 0;
    int  getLeafSize1(Node root) {
        if(root==null){
            return 0;
        }
        if (root.right == null && root.left == null) {
            leafSize++;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);
        return leafSize;
    }

    // ������˼·-��Ҷ�ӽ�����
    int getLeafSize2(Node root) {
        if(root==null){
            return 0;
        }
        if (root.right == null && root.left == null) {
            return 1;
        }
        return getLeafSize2(root.left)
                + getLeafSize2(root.right);
    }

    // ������˼·-��� k �������
    int getKLevelSize(Node root) {
        return 0;
    }

    // �������
    void levelOrderTraversal(Node root) {

    }
    //�ж�һ�����ǲ�����ȫ������
     boolean isCompleteTree(Node root){
       if(root==null){
           return true;
       }
       return false;
    }
