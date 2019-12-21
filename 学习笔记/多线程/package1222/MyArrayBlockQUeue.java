package package1221;
/*
要求：多生产者-多消费者正确，但是效率不保证
可改进点：
1、锁是生产者和消费者都在竞争的锁
   生产者和消费者之间共享size
   生产者和生产者之间共享size+rear
   消费者和消费者之间共享size+front
2、通知（全通知）
    精准通知：生产者只通知消费者
              消费者只通知生产者
 */


public class MyArrayBlockQUeue {
    private int [] array;
    //已有元素个数
    private volatile int size;//volatile最主要的目的是给size（）方法保证可见性用的
    //队首元素所在下标
    private int front;
    //下一个要插入元素的下标
    private int rear;

    MyArrayBlockQUeue(int capacity){
        array =new int [capacity];
        size=0;
        front=0;
        rear=0;
    }
    public void put(int element) throws InterruptedException {
        while (size==array.length){
            wait();
        }
        array[rear++]=element;
        if(rear==array.length){
            rear=0;
        }
        size++;
        //唤醒正在睡眠的生产者+消费者
        //因为我们无法保证只唤醒消费者
        notifyAll();
    }
    public synchronized int take() throws InterruptedException {
        while (size==0){
            wait();
        }
        int element=array[front++];

        if (front==array.length){
            front=0;
        }
        size--;
        //唤醒正在睡眠的生产者+消费者
        //因为我们无法保证只唤醒生产者
        notifyAll();
        return  element;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
}
