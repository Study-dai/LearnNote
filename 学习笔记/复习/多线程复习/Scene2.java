package 多线程复习;

import java.util.Scanner;

//多线程计算fib数列
//主线程输入
//其他线程计算
public class Scene2 {
    private static long fib(int n){
        if(n<2){
            return n;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }
    private  static class MyThread extends Thread{
        private int n;
        MyThread(int n){
            this.n=n;
        }
        @Override
        public void run() {
            long restlt=fib(n);
            System.out.printf("fib(%d)的计算结果是 %d%n",n,restlt);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.print("请输入要计算的n:");
            //主线程等待系统输入，无输入就一直等
            int n=scanner.nextInt();
            //有输入就交给其他线程计   算
            Thread thread=new MyThread(n);
            thread.start();
        }
    }
}
