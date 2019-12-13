package package1212;
// 演示线程不安全操作
public class ShowThreadNotSafe {
    private static long n=0L;
    private static class MyThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i <50000 ; i++) {
                synchronized (ShowThreadNotSafe.class) {
                    n++;
                }
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads=new Thread[5];
        for (int i = 0; i < 5; i++) {
            Thread t=new MyThread();
            t.start();
            threads[i]=t;
        }
        for (int i = 0; i <5; i++) {
            threads[i].join();
        }
        System.out.println(n);
    }
}
//执行结果：250000