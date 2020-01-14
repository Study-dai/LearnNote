package 多线程复习2;
//关注NEW、RUNNABLE、TERMINATED状态转换
public class ThreadStateTransfer {
    public static void main(String[] args) {
        Thread t=new Thread(()->{
            for (int i = 0; i <1000_0000 ; i++) {
            }
        },"小代");
        System.out.println(t.getName()+":"+t.getState());
        t.start();
        while(t.isAlive()){
            System.out.println(t.getName()+":"+t.getState());
        }
        System.out.println(t.getName()+":"+t.getState());
    }
}
