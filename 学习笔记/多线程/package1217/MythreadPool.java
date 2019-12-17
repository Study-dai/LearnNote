package package1217;

import package1215.SyncAndState;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class MythreadPool {
    private static class Worker extends Thread{
    private BlockingQueue<Runnable>queue=null;
    Worker(BlockingQueue<Runnable>queue){
        super("我是劳动人民");
    }
        @Override
        public void run() {
            try {
                while(Thread.interrupted()) {
                    Runnable commend = queue.take();
                    commend.run();
                }
                } catch (InterruptedException e) {}
            }
        }
        private int corePoolSize=10;
        private int currnetPoolSize=0;
        private List<Worker> workerList=new ArrayList<>();
        private BlockingDeque<Runnable>queue=new LinkedBlockingDeque<>();


    public void execute(Runnable command){
            if(currnetPoolSize<corePoolSize){
                Worker worker=new Worker(queue);
                workerList.add(worker);
                currnetPoolSize++;
            }
            queue.add(command);
        }
        public void shutDown() throws InterruptedException {
            for(Worker worker:workerList){
                worker.interrupt();
            }
            for (Worker worker:workerList){
                worker.join();
            }
        }

    public static void main(String[] args) throws InterruptedException {
        MythreadPool pool=new MythreadPool();
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("吃饭");
            }
        });
        Thread.sleep(10);
        pool.shutDown();
    }
}
