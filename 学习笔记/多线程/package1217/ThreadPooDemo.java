package package1217;

import java.util.concurrent.*;

public class ThreadPooDemo {
    public static void main(String[] args) {
        BlockingQueue<Runnable>queue=new ArrayBlockingQueue<Runnable>(30);
        ExecutorService pool=new ThreadPoolExecutor(
                10,
                20,
                5,
                TimeUnit.SECONDS,
                queue
        );
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("吃饭");
            }
        });
    }
}
