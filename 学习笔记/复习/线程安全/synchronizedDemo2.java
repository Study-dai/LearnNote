package 线程安全;
//锁的synchronizedDemo类的对象
public class synchronizedDemo2 {
    public synchronized static void methond() {

    }
    public static void main(String[] args) {
        methond();//进入方法会锁synchronized.class指向对象中的锁，出方法会释放synchronized.class指向对象中的锁。
    }
}
