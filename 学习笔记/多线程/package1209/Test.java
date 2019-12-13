package package1209;
//如何创建线程
public class Test extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("我是启动起来的线程");
        }
    }
    public static void main(String[] args) {
        Test test=new Test();
        test.start();
        while (true){
            System.out.println("我是主线程");
        }
    }
}

