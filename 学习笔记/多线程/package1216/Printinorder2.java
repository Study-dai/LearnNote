package psckage1216;
//加上wait()和notify（）
public class Printinorder2 {
        private  int  i=0;
        public synchronized void first() throws InterruptedException {
            if(i==0) {
                System.out.println("one");
                i=1;
                notifyAll();
            }
            wait();
        }
        public synchronized void second() throws InterruptedException {
            if(i==1) {
                System.out.println("two");
                i=2;
                notifyAll();
            }
            wait();
        }
        public synchronized void third() throws InterruptedException {
            if(i==2) {
                System.out.println("three");
                i=0;
                notifyAll();
            }
            wait();
        }
        private static class printOne extends Thread{
            Printinorder2 object;
            public printOne(Printinorder2 object) {
                this.object = object;
            }

            @Override
            public void run() {
                while(true){
                    try {
                        object.first();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        private static class printTwo extends Thread{
            Printinorder2 object;
            public printTwo(Printinorder2 object) {
                this.object = object;
            }

            @Override
            public void run() {
                while(true){
                    try {
                        object.second();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        private static class printThree extends Thread{
          Printinorder2 object;
            public printThree(Printinorder2 object) {
                this.object = object;
            }

            @Override
            public void run() {
                while(true){
                    try {
                        object.third();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        public static void main(String[] args) {
            Printinorder2 object=new Printinorder2();
            Thread t1=new Printinorder2.printOne(object);
            Thread t2=new Printinorder2.printTwo(object);
            Thread t3=new Printinorder2.printThree(object);
            t1.start();
            t2.start();
            t3.start();

        }
    }

