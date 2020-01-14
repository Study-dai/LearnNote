package 多线程复习;

public class CreateThread {
    private static final long COUNT=1_0000_0000L;
    private static class MyThread extends Thread{
        @Override
        public void run() {
            long r=0;
            for (int i = 0; i <COUNT; i++) {
                r+=(i*i);
            }
            System.out.println(r);
        }
    }
    private static class MyRunnable implements Runnable{
        @Override
        public void run() {
            long r=0;
            for (int i = 0; i <COUNT; i++) {
                r+=(i*i);
            }
            System.out.println(r);
        }
    }

    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        //由于myThread直接继承自Thread类，所以可以直接调用start方法
        myThread.start();
        //对于实现Runnbale接口，先创建Thread对象，将Runnable 作为构造方法传进去
        //然后就可以调用Thread的start方法了
        MyRunnable myRunnable=new MyRunnable();
        Thread thread=new Thread(myRunnable);
        thread.start();
        //继承Thread，作为参数
        Thread thread1=new Thread(myThread);
        thread1.start();
    }
}
