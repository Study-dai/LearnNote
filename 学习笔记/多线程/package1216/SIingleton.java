package psckage1216;

public class SIingleton {
    private int field=0;
    private static volatile SIingleton instance=null;
    private SIingleton(){
        field=100;
    }

    public static SIingleton getInstance(){
        if(instance==null){
            synchronized (SIingleton.class){
                //加到里面，提高效率
                if(instance==null){
                    instance=new SIingleton();
                    //为啥进行二次判断
                    //当多个线程抢锁时
                }
            }
        }
        return instance;
    }
    private static class Mythread extends Thread {
        @Override
        public void run() {
            SIingleton s = SIingleton.getInstance();
            System.out.println(s + ":"+s.field);
        }
    }
        public static void main(String[] args) {

        }
}
