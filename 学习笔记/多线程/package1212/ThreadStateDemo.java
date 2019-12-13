package package1212;
//线程的状态都有哪些
public class ThreadStateDemo {
    public static void main(String[] args) {
     Thread.State[] values=Thread.State.values();
     for(Thread.State state:values){
         System.out.println(state);
     }
    }
}
/*
NEW
RUNNABLE
BLOCKED
WAITING
TIMED_WAITING
TERMINATED
 */