package packagemyStack;

public class MyQueue2 {
    private int [] data=new int[100];
    private  int head=0;//队首元素下标
    private int tail=0;//队尾元素下标
    private int size=0;

    //1.入队列，插入成功返回true，失败返回false
    // 如果队列满了就会插入失败
    public boolean offer(int x){
        if(size==data.length){
            return false;
        }
        //新元素放到tail的位置上
        data[tail]=x;
        tail++;
        if(tail==data.length){
            tail=0;
        }
        size++;
        return true;
    }
    //2.出队列
    public Integer poll(){
        if(size==0){
            return null;
        }
        Integer ret=data[head];
        head++;
        if(head==data.length){
            head=0;
        }
        size--;
        return ret;
    }
    //3.取队列首元素
    public Integer peek(){
        if(size==0){
            return null;
        }
        return data[head];
    }
    //4、判定为空
    public boolean isEmpty(){
        return size==0;
    }
    //5、取长度
    public int size(){
        return size;
    }
    //测试
    public static void main(String[] args) {
        MyQueue2 myQueue2=new MyQueue2();
        myQueue2.offer(1);
        myQueue2.offer(2);
        myQueue2.offer(3);
        myQueue2.offer(4);
        while(!myQueue2.isEmpty()){
            Integer cur=myQueue2.peek();
            System.out.println(cur);
            myQueue2.poll();
        }
    }
}
