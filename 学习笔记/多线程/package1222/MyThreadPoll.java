package package1221;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;

/*
简版线程池
只考虑正式员工，不考虑临时工 也不考虑拒绝策略
 */
 class MyThreadPool {
    private static class Worker extends Thread {
        private BlockingQueue<Runnable> queue;

        Worker(BlockingQueue<Runnable> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            while (!Thread.interrupted()) {
                Runnable command = null;
                try {
                    command = queue.take();
                    command.run();
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    }
        private int currentPoolSize;
        private int corePoolSize;
        private BlockingQueue<Runnable> queue;
        private List<Worker> workerList;

        public MyThreadPool(int corePoolSize, BlockingQueue<Runnable> queue) {
           this. currentPoolSize =0;
           this.corePoolSize=corePoolSize;
           this.queue=queue;
           this.workerList=new ArrayList<>();
        }
        public void execute(Runnable command){
            if(currentPoolSize<corePoolSize){
                //雇人
                Worker worker=new Worker(queue);
                //工人加花名册
                workerList.add(worker);
                //让工人行动起来
                worker.start();
                currentPoolSize++;
            }
            queue.add(command);
    }
    /*
    公司破产
     */
    public void shutDown() throws InterruptedException {
        //挨个通知大家下岗
        for (Worker worker:workerList){
            worker.interrupt();
        }
        //等待大家真的下岗（先通知，效率比较高）
        for(Worker worker:workerList){
            worker.join();
        }
    }

}
