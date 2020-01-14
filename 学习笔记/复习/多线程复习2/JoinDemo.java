package 多线程复习2;
//join，等待一个线程结束来执行下一个线程
public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Runnable target=()->{
            for (int i = 0; i <10; i++) {
                System.out.println(Thread.currentThread().getName()+":我还在工作！");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+":我结束了！");
        };
        Thread thread1=new Thread(target,"小代");
        Thread thread2=new Thread(target,"小赵");
        System.out.println("让小代先开始工作");
        thread1.start();
        thread1.join();
        System.out.println("小代工作结束了，让小赵开始工作");
        thread2.start();
        thread2.join();
        System.out.println("小赵工作结束了");
    }
}
/*
执行结果：
让小代先开始工作
小代:我还在工作！
小代:我还在工作！
小代:我还在工作！
小代:我还在工作！
小代:我还在工作！
小代:我还在工作！
小代:我还在工作！
小代:我还在工作！
小代:我还在工作！
小代:我还在工作！
小代:我结束了！
小代工作结束了，让小赵开始工作
小赵:我还在工作！
小赵:我还在工作！
小赵:我还在工作！
小赵:我还在工作！
小赵:我还在工作！
小赵:我还在工作！
小赵:我还在工作！
小赵:我还在工作！
小赵:我还在工作！
小赵:我还在工作！
小赵:我结束了！
小赵工作结束了
 */