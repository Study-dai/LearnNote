package package1210;

public class AnonymousAndLambda {
    public static void main(String[] args) {
        Thread t1=new Thread(){
            @Override
            public void run() {
            }
        };
        t1.start();
        Thread t2=new Thread(()-> {});
        t2.start();
    }
}
