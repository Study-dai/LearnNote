package package1210;
/*Thread的几个常见属性
ID 是线程的唯一标识，不同线程不会重复
名称是各种调试工具用到
状态表示线程当前所处的一个情况，下面我们会进一步说明
优先级高的线程理论上来说更容易被调度到
关于后台线程，需要记住一点：JVM会在一个进程的所有非后台线程结束后，才会结束运行。
是否存活，即简单的理解，为 run 方法是否运行结束了
线程的中断问题，下面我们进一步说明
 */
public class Main {
    public static void main(String[] args) {
        Thread thread=new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+"我还活着");
                try {
                    Thread.sleep(1*1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"我即将死去");
        });
        System.out.println(Thread.currentThread().getName() +":id:"+thread.getId());
        System.out.println(Thread.currentThread().getName() +":名称:"+thread.getName());
        System.out.println(Thread.currentThread().getName() +":状态:"+thread.getState());
        System.out.println(Thread.currentThread().getName() +":优先级:"+thread.getPriority());
        System.out.println(Thread.currentThread().getName() +":是否是后台线程:"+thread.getPriority());
        System.out.println(Thread.currentThread().getName() +":是否活着:"+thread.getPriority());
        System.out.println(Thread.currentThread().getName() +":是否被中断:"+thread.getPriority());
        thread.start();
        while(thread.isAlive()){}
        System.out.println(Thread.currentThread().getName() +":状态:"+thread.getState());
    }
}
/*
执行结果：
main:id:12
main:名称:Thread-0
main:状态:NEW
main:优先级:5
main:后台进程:5
main:活着:5
main:被中断:5
Thread-0我还活着
Thread-0我还活着
Thread-0我还活着
Thread-0我还活着
Thread-0我还活着
Thread-0我还活着
Thread-0我还活着
Thread-0我还活着
Thread-0我还活着
Thread-0我还活着
Thread-0我即将死去
main:状态:TERMINATED

*/