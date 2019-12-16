package psckage1216;

import java.util.Scanner;
//wait()方法和notify()方法。
public class Main {
    private static Object object=new Object();
    private static class AThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i <10; i++) {
                System.out.println("A:在扫地");
            }
            try {
               synchronized (object){
                   object.wait();
               }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i <10; i++) {
                System.out.println("A:擦桌子");
            }
        }
    }

    public static void main(String[] args) {
        Thread aThread=new AThread();
        aThread.start();
        Scanner sc=new Scanner(System.in);
        System.out.println("随便输入啥，A就去擦桌子");
        sc.nextLine();
       synchronized (object){
            object.notify();
        }
    }
}
