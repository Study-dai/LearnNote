package package1210;
//杀死线程
public class HowThreadDie {
    public static class Worker extends Thread {
        public volatile boolean running = false;
        public void quit() {
            running = false;
        }
        @Override
        public void run() {
            while (running) {
                System.out.println("挖煤");
                try {
                    Thread.sleep(20 * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
        public static void main(String[] args) throws InterruptedException{
            Worker worker=new Worker();
            worker.start();
            System.out.println("老婆生孩子了，赶紧回家");
            worker.quit();
            worker.join();
            System.out.println("他回去了");
        }
    }
/*
执行结果：
老婆生孩子了，赶紧回家
他回去了
 */