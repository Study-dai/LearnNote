package package1210;
//多线程计算1-1000000000的和
public class Scene {
    public static final int count=100000000;
    public static class Mythread extends Thread{
        @Override
        public void run(){
            long b=0;
            for (int i = 0; i <count; i++) {
                b+=i;
            }
        }
    }
    // 多线程版本
    public static void multithread() throws InterruptedException {
        long begin=System.currentTimeMillis();
        Mythread thread=new Mythread();
        long a=0;
        for (int i = 0; i <count; i++) {
            a+=i;
        }
        thread.join();
        long end=System.currentTimeMillis();
        System.out.println(end-begin);
    }
    //单线程版本
    private static void onethread(){
        long begin=System.currentTimeMillis();
        long b=0;
        for (int i = 0; i <count; i++) {
            b+=i;
        }
        long a=0;
        for (int i = 0; i <count; i++) {
            a+=i;
        }
        long end=System.currentTimeMillis();
        System.out.println(end-begin);
    }
    public static void main(String[] args) throws InterruptedException {
        multithread();
        onethread();
    }
}
