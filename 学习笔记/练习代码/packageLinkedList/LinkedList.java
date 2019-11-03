package packageLinkedList;
public class LinkedList {
    //先创建链表的头结点（head），
    //有了头结点，就可以把next剩下的元素都获取到
    private LinkedNode head = null;

    //一、创建打印的方法
    public void display() {
        System.out.print("[");
        for (LinkedNode node = this.head; node != null; node = node.next) {
            System.out.print(node.data);
            if (node.next != null) {
                //如果不是最后一个元素就加上逗号，否则不加
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    //创建求链表长度的方法
    public int size() {
        int size=0;
        for(LinkedNode cur=this.head;cur!=null;cur=cur.next){
            size++;
        }
        return size;
    }

    //二、创建头插的方法
    public void addFirst(int elem) {
        //先创建一个结点，让这个结点的值就是elem
        LinkedNode node = new LinkedNode(elem);
        //先判断链表是不是为空
        if (this.head == null) {
            this.head = node;
            return;
            //如果是空链表，使head这个引用指向新创建的结点
            //此时链表中只有node这一个结点
        }
        //如果不是空链表，就需要把新节点放到链表开始的位置上
        node.next = head;
        this.head = node;
        return;
    }
    //三、创建尾插的方法
    public void addLast(int elem) {
        //先创建要插入到尾部的结点
        LinkedNode node = new LinkedNode(elem);
        //如果是空链表，直接把这个结点放上去就行
        if (this.head == null) {
            this.head = node;
            return;
        }
        //先定义一个cur来判断是不是最后一个结点
        LinkedNode cur = this.head;
        //非空情况，找到最后一个结点
        //定义一个循环
        while (cur.next != null) {
            cur = cur.next;
        }//这个循环结束之后,cur就是最后一个结点
        //然后使cur指向要插入的那个结点
        cur.next = node;
    }

    //往任意位置插入，第一个数据结点为0号下标
    public void addIndex(int index, int elem) {
        //先创建结点
        LinkedNode node = new LinkedNode(elem);
        //1、先对index进行一个合法性校验
        // 这就需要知道链表的长度，得在外部创建一个size方法求长度
        int len = size();
        if (index < 0 || index > len) {
            return;
        }
        if (index == 0) {
            //2、处理头插的情况
            addFirst(elem);
            return;
        }
        if (index == len) {
            //3、处理尾插的情况
            addLast(elem);
            return;
        }
        //4、处理插入到中间位置的元素
        //比如说要插入到第二个和第三个结点的中间，index=3
        //就要先找到index-1，也就是第二个结点
        //prev这个引用就对应到index-1的位置
        LinkedNode prev = getIndexPos(index-1);
        //5、完成具体的插入
        node.next=prev.next;
        prev.next=node;
        //这里的赋值是地址之间的赋值
    }
    //创建求index前一个位置的元素
    private LinkedNode getIndexPos(int index){
        //是否要判断index在有效范围之中(虽然前面判定了，但双重保险更安全）
        LinkedNode cur = this.head;
        for (int i = 0; i < index; i++) {
            cur=cur.next;
        }
        return cur;
    }
    //四、查找关键字key是否在单链表当中
    public boolean contains(int key){
        //直接遍历链表，依次比较每个元素和key一样不一样就行
        for(LinkedNode cur=this.head;cur!=null;cur=cur.next){
            if(cur.data==key){
                return true;
            }
        }
        return false;
    }
    //五、删除第一次出现关键字为key的结点
    //删除元素的核心是要找到要删除元素的前一个元素的位置
    public void remove (int toRemove){
        //1、先单独处理空链表的情况
        if(head==null){
            return;
        }
        //2、要考虑是否要删除的是头结点
        if(head.data==toRemove){
            this.head=this.head.next;
            //跳过第一个结点，直接让head指向第二个结点（head.next)
            //第一个结点没有指向就被C自动回收
            return;
        }
        //3、删除中间结点，先找到要删除元素的前一个元素
        LinkedNode prev=searchPrev(toRemove);
        //借助这个searchPrev这个方法找到toRemove的前一个元素
        // prev.next=prev.next.next;这个写法不容易理解
        //引入一个新的 nodeToRemove结点使其在prev的后面
        LinkedNode  nodeToRemove=prev.next;
        prev.next=nodeToRemove.next;
    }
    //创建找toRemove前一个元素位置的方法
    private LinkedNode searchPrev(int toRemove){
        //找到要删除元素的前一个位置
        LinkedNode prev=this.head;
        while(prev.next!=null){
            if(prev.next.data==toRemove){
                return prev;
            }
            prev=prev.next;
        }
        //返回null表示没找到
        return null;
    }
    //六、删除所有值为key的结点（按值移除）
    public void removeAllkey(int key){
        if(head==null){
            //判断是不是空链表，是就不用删除了直接返回
            return;
        }
        //先不管头结点，先把后面的所有该删的结点都删除完
        //最后处理头结点
        LinkedNode prev=head;
        LinkedNode cur=head.next;
        while(cur!=null){
            if(cur.data==key){
                //cur对应的结点就应该删除
                prev.next=cur.next;
                cur=prev.next;
            }else{
                //cur对应的结点不用删除
                //同时更新 prev和cur；
                //保持prev永远是cur 的前一个元素
                prev=cur;
                cur=cur.next;
                //删除头结点的情况
                if(this.head.data==key){
                    this.head=this.head.next;
                }
            }
        }
    }
    //七、清除链表操作
    public void Clear (){
        this.head=null;
        //后面的所有结点没有引用指向，就会被JVM自动回收

    }
}