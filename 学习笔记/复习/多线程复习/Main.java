package 多线程复习;
//如何创建一个线程
        //1、先让这个类继承Thread类
public class Main extends Thread{
        //2、覆写run方法
    @Override
    public void run() {
        while(true){
            System.out.println("启动起来的线程");
        }
    }
    public static void main(String[] args) {
        //3、创建线程的对象
        Main main=new Main();
        //4、调用start方法让线程运行起来
        main.start();
        while(true){
            System.out.println("我是主线程");
        }
    }
}
/*
在cmd中使用jconsole命令查看线程的状态
 */
