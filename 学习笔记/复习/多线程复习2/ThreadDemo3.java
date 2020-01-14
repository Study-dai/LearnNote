package 多线程复习2;
//线程sleep，通过异常收到了中断的情况
public class ThreadDemo3 {
    private static class MyRunnable implements Runnable{
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("通过异常收到了中断情况");
            }
            for (int i = 0; i <10 ; i++) {
                System.out.println(Thread.currentThread().isInterrupted());
            }
        }
    }
    public static void main(String[] args) {
        MyRunnable target =new MyRunnable();
        Thread thread=new Thread(target,"小代");
        thread.start();
        thread.interrupt();
    }
}
/*
通过异常收到了中断情况  通过异常收到中断通知，并且标志位被清
false
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