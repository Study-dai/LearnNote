package 线程安全;
//明确锁的对象
public class synchronizedDemo3 {
    public synchronized  void methond() {
//进入代码块会锁this指向对象中的锁，出代码块会释放this指向的对象中的锁
        synchronized (this){
        }
    }
    public static void main(String[] args) {
        synchronizedDemo3 demo3=new synchronizedDemo3();
        demo3.methond();
    }
}

