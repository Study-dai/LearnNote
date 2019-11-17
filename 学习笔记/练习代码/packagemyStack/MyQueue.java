package packagemyStack;

class Node{
    int val;
    Node next;
    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
    Node (int val){
        this(val,null);
    }
}

public class MyQueue {
    private Node head=null;
    private Node tail=null;
    private int size=0;
    //1、入队列,插入到尾部
    public void offer(int v){
        Node node=new Node(v);
        //空链表
        if(tail==null){
            head=node;
        }else{
            //非空链表
            tail.next=node;
        }
        tail=node;
        size++;
    }
    //2、出队列
    public int poll(){
        if(size==0){
            throw new RuntimeException("队列为空！");
        }
        Node oldhead=head;
        head=head.next;
        //空队列
        if(head==null){
            tail=null;
        }
        size--;
        return oldhead.val;
    }
    //3、取队首元素
    public int peek(){
        if(size==0){
            throw new RuntimeException("队列为空");
        }
        return head.val;
    }
    //4、判断队列是否为空
    public boolean isEmpty(){
        return size==0;
    }
    //5、求队列长度
    public int size(){
        return size;
    }
    //测试
    public static void main(String[] args) {
        MyQueue myQueue=new MyQueue();
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        myQueue.offer(4);
        while(!myQueue.isEmpty()){
            int curFront=myQueue.peek();
            System.out.println(curFront);
            myQueue.poll();
        }
    }
}
