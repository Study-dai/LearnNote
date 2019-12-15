package package1215;
//哲学家吃火锅（五个全部锁死,不释放锁）
public class DeadLock {
    private static Object alock=new Object();
    private static Object block=new Object();

    private static class AThread extends Thread{
        @Override
        public void run() {
            synchronized (alock){
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (block){
                    System.out.println("A:吃火锅");
                }
            }
        }
    }
    private static class BThread extends Thread{
        @Override
        public void run() {
            synchronized (block){
                synchronized (alock){
                    System.out.println("B:吃火锅");
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AThread aThread=new AThread();
        BThread bThread=new BThread();
        aThread.start();
        Thread.sleep(2000);
        bThread.start();
    }
}
