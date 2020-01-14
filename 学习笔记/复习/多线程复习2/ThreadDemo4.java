package 多线程复习2;

public class ThreadDemo4 {
    private static class MyRunnable implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i <10 ; i++) {
                System.out.println(Thread.interrupted());
            }
        }
    }
    public static void main(String[] args) {
        MyRunnable target=new MyRunnable();
        Thread thread=new Thread(target,"小代");
        thread.start();
        thread.interrupt();
    }
}
/*
执行结果：
true   一开始是true，，后边的标志位都被清除了，所以是false
false
false
false
false
false
false
false
false
false
 */