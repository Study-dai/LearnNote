public class BinnaryTree {
    //人为创建一个二叉树
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

    //递归思想：终止条件+递归公式
    //前序遍历
    void preOrderTrversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrderTrversal(root.left);
        preOrderTrversal(root.right);
    }

    //中序遍历
    void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.println(root.val + " ");
        inOrderTraversal(root.right);

    }

    //后序遍历
    void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.val + " ");
    }

    //遍历思路-求结点个数
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

    //子问题思路-求结点个数
    int getSize2(Node root) {
        if (root == null) {
            return 0;
        }
        return getSize2(root.left)
                + getSize2(root.right) + 1;
    }

    //遍历思路-求叶子结点个数
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

    // 子问题思路-求叶子结点个数
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

    // 子问题思路-求第 k 层结点个数
    int getKLevelSize(Node root) {
        return 0;
    }

    // 层序遍历
    void levelOrderTraversal(Node root) {

    }
    //判断一棵树是不是完全二叉树
     boolean isCompleteTree(Node root){
       if(root==null){
           return true;
       }
       return false;
    }
