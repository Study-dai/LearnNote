package 多线程复习2;
//获取线程的所有状态
public class ThreadState {
    public static void main(String[] args) {
        for(Thread.State state:Thread.State.values()){
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