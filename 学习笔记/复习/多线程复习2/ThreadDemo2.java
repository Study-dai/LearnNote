package 多线程复习2;


//停止线程的方式
//调用interrupt（）方法来通知
public class ThreadDemo2 {
    private static class MyRunnable implements Runnable{
        @Override
        public void run() {
            while(!Thread.interrupted()){
                System.out.println(Thread.currentThread().getName()+"：别管我，我正在干活");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println(Thread.currentThread().getName()+"：有情况，现在停止工作");
                    break;
                }
            }
            System.out.println(Thread.currentThread().getName()+":停下来了");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MyRunnable target=new MyRunnable();
        Thread thread=new Thread(target,"小代");
        System.out.println(Thread.currentThread().getName()+"：让小代开始工作");
        thread.start();
        Thread.sleep(10*1000);
        System.out.println(Thread.currentThread().getName()+"：让小代停下来");
        thread.interrupt();
    }
}
/*
执行结果：
main：让小代开始工作
小代：别管我，我正在干活
小代：别管我，我正在干活
小代：别管我，我正在干活
小代：别管我，我正在干活
小代：别管我，我正在干活
小代：别管我，我正在干活
小代：别管我，我正在干活
小代：别管我，我正在干活
小代：别管我，我正在干活
小代：别管我，我正在干活
main：让小代停下来
java.lang.InterruptedException: sleep interrupted
小代：有情况，现在停止线程
	at java.lang.Thread.sleep(Native Method)
小代:停下来了
	at 多线程复习2.ThreadDemo2$MyRunnable.run(ThreadDemo2.java:13)
	at java.lang.Thread.run(Thread.java:748)

 */