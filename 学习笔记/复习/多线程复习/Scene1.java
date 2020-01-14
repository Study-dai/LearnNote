package 多线程复习;
//为什么要使用多线程
public class Scene1 {
    private static final int count=1_0000_0000;
    public static class MyThread extends Thread{
        @Override
        public void run() {
            long b=0;
            for (int i = 0; i < count; i++) {
                b+=i;
            }
        }
    }
    //多线程版本计算
    private  static void multithread() throws InterruptedException {
        // 取开始时间，以毫秒为单位
        long begin=System.currentTimeMillis();
        MyThread myThread=new MyThread();
        myThread.start();
        long a=0;
        for (int i = 0; i <count ; i++) {
            a+=i;
        }
        //等待另一个线程计算完成
        myThread.join();
        //取结束时间
        long end=System.currentTimeMillis();
        System.out.println(end-begin);
    }
    //单线程版本计算
    private static void onethread(){
        long begin=System.currentTimeMillis();
        long a=0;
        for (int i = 0; i <count ; i++) {
            a+=i;
        }
        long b=0;
        for (int i = 0; i <count ; i++) {
            b+=i;
        }
        long end=System.currentTimeMillis();
        System.out.println(end-begin);
    }
    public static void main(String[] args) throws InterruptedException {
       multithread(); //40ms
       onethread();   //60ms
        //结果：使用多线程可以提升效率
        //但是有些场景下，使用多线程导致线程启动占用时间反而较多，导致不一定快
        //某些场景下主线程会阻塞，导致必须使用多线程工作。
    }
}
