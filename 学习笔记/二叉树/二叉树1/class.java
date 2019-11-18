class Node{
    char val;//数据域
    Node left;//左孩子的引用 常常代表左孩子为根的整颗左子树
    Node right;//右孩子的引用 常常代表右孩子为根的整颗左子树
    Node parenrt;//可选的，双亲的引用,作用是利用自结点找到父节点

    public Node(char val) {
        this.val = val;
    }
}