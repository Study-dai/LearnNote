package 线程安全;
//锁的synchronized对象
public class synchronizedDemo {
    public synchronized void methond(){

    }
    public static void main(String[] args) {
        synchronizedDemo demo=new synchronizedDemo();
        demo.methond();//进入方法会锁demo指向对象中的锁，出方法会释放demo指向对象中的锁。
    }
}
