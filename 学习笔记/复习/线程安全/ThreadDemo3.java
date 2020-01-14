package 线程安全;
//解决线程不安全的问题
public class ThreadDemo3 {
    private static class Counter{
        private long n=0;
        public synchronized void increment(){
            n++;
        }
        public synchronized void decrement(){
            n--;
        }
        public synchronized long value(){
            return n;
        }
    }
    public static void main(String[] args) throws InterruptedException {
        final int COUNT=1000_0000;
       Counter counter=new Counter();

        Thread thread=new Thread(()->{
            for (int i = 0; i < COUNT ; i++) {
                counter.increment();
            }
        },"代");
        thread.start();
        for (int i = 0; i <COUNT ; i++) {
            counter.decrement();
        }
        thread.join();
        //期望最终结果应该是0
        System.out.println(counter.value());
    }
}
/*
执行结果：0
 */