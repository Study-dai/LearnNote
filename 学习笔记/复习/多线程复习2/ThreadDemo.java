package 多线程复习2;
//停止线程的方式
//共享标记
public class ThreadDemo {
    private static class MyRunnable implements Runnable{
        //volatile修饰变量，不允许线程内部缓存和重排序，也就是直接修改内存
        //定义线程初始为不主动放弃状态
        public volatile boolean isQuit=false;
        @Override
        public void run() {
            while(!isQuit){
                System.out.println(Thread.currentThread().getName()+"：我正在运行");
                try {
                    //定义每1秒休眠一次
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"：停下来了");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MyRunnable target=new MyRunnable();
        //创建线程对象并且命名为小代
        Thread thread=new Thread(target,"小代");
        System.out.println(Thread.currentThread().getName()+":让小代这个线程开始运行");
        thread.start();
        //定义每10秒休眠一次
        Thread.sleep(10*1000);
        System.out.println(Thread.currentThread().getName()+":让小代这个线程停止运行");
        //让线程初始状态变为不运行，就不执行run（）方法了。
        target.isQuit=true;
    }
}
/*
执行结果：
main:让小代这个线程开始运行
小代：我正在运行
小代：我正在运行
小代：我正在运行
小代：我正在运行
小代：我正在运行
小代：我正在运行
小代：我正在运行
小代：我正在运行
小代：我正在运行
小代：我正在运行
main:让小代这个线程停止运行
小代：停下来了

 */