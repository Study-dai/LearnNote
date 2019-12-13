package package1210;
//杀死线程
public class HowThreadDie2 {
    public static class Worker extends Thread {
        public volatile boolean running = false;

        @Override
        public void run() {
            while (!Thread.interrupted()) {
                System.out.println("挖煤");
                try {
                    Thread.sleep(50 * 1000);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    }
        public static void main(String[] args) throws InterruptedException {
              Worker worker=new Worker();
              worker.start();
              Thread.sleep(3*1000);
              System.out.println("老婆生孩子了，快回家");
              worker.interrupt();
              worker.join();
              System.out.println("他回去了");
        }
    }
/*
执行结果：
挖煤 --几秒之后
老婆生孩子了，快回家
他回去了

 */