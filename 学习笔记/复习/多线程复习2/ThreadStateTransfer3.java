package 多线程复习2;
//yield()让出CPU
public class ThreadStateTransfer3 {
    public static void main(String[] args) {
        Thread thread1=new Thread(()->{
            while(true){
                System.out.println(Thread.currentThread().getName()+"：我正在工作");
                //Thread.yield();
            }
        },"小代");
        Thread thread2=new Thread(()->{
            while(true){
                System.out.println(Thread.currentThread().getName()+"：我正在工作");
            }
        },"小赵");
        thread1.start();
        thread2.start();
    }
}
//打印出来小赵的工作多于小代的工作。
