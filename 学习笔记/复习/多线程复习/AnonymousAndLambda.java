package 多线程复习;
//匿名类和Lambda
public class AnonymousAndLambda {
    public static void main(String[] args) {
        Thread t=new Thread(){
            @Override
            public void run() {

            }
        };
        t.start();
        Thread t2=new Thread(){
            @Override
            public void run() {
            }
        };
        t2.start();
    }
}
