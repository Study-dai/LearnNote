package 多线程复习;

public class ThreadFields {
    public static void main(String[] args) {
        //Thread.currentThread()
        //获取当前线程Thread对象
        Thread currentThread=Thread.currentThread();
        System.out.println(currentThread.getName());//获取名称
        System.out.println(currentThread.getId());//获取Id
        System.out.println(currentThread.getPriority());//优先级
        System.out.println(currentThread.getState());//状态
        System.out.println(currentThread.isDaemon());//是否是后台线程
        System.out.println(currentThread.isAlive());//是否存活
        System.out.println(currentThread.isInterrupted());//是否被中断
    }
}
