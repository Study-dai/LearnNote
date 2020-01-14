package 多线程复习2;

public class ThreadDemo5 {
    private static class MyRunnbale implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread .currentThread().isInterrupted());
            }
        }
    }
    public static void main(String[] args) {
        MyRunnbale target=new MyRunnbale();
        Thread thread=new Thread(target,"小代");
        thread.start();
        thread.interrupt();
    }
}
/*
执行结果：
true   全部是true，因为标志位没有被清除
true
true
true
true
true
true
true
true
true
 */
