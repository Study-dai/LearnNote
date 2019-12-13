package package1210.练习;
import java.util.Random;
public class ThreadDemo {
    private static class  myThread extends Thread{
        @Override
        public void run(){
            Random random=new Random();
            while(true){
                //打印线程名称
                System.out.println(Thread.currentThread().getName());
                //随机停止运行0-9秒
                try {
                    Thread.sleep(random.nextInt(10));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        myThread t1=new myThread();
        myThread t2=new myThread();
        myThread t3=new myThread();
        t1.start();
        t2.start();
        t3.start();
        Random random=new Random();
        while(true){
            //打印线程名称
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(random.nextInt());
            } catch (InterruptedException e) {
                //随机停止运行0-9秒
                e.printStackTrace();
            }
        }

    }
}

