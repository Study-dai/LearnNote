package package1210;
//如何创建多线程对象Thread 对象
//1、继承Thread类+覆写run方法
//2、实现Runnable接口+覆写run方法
//3、继承Thread ,作为参数
public class CreateThread {
    public static final long count=1_0000_0000L;
    private static class Mythread extends Thread{
        @Override
        public void run(){
            long r=0;
            for (int i = 0; i <count ; i++) {
                r+=(i*i);
            }
            System.out.println(r);
        }
    }
public static class MyRunnable implements Runnable {
    @Override
    public void run() {
        long r = 0;
        for (int i = 0; i < count; i++) {
            r += (i*i);
        }
        System.out.println(r);
    }
}
    public static void main(String[] args) {
        Mythread mythread=new Mythread();
        mythread.start();

        MyRunnable myRunnable=new MyRunnable();
        Thread thread=new Thread(myRunnable);
        thread.start();
    }
}
/*
运行结果：
20047455266176
20047455266176
*/