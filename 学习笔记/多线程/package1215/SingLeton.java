package package1215;

public class SingLeton {
    private int field=0;
    private SingLeton(){
        field=100;
    }
    private static volatile  SingLeton instance=null;
    public static SingLeton getInstance(){
        if(instance==null){
            synchronized (SingLeton.class){
                if(instance==null){
                    instance=new SingLeton();
                }
            }
        }
        return instance;
    }
    private static class MyThread extends Thread{
        @Override
        public void run() {
           SingLeton s=SingLeton.getInstance();
            System.out.println(s+":"+s.field);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i <100; i++) {
            new MyThread().start();
        }
    }
}
