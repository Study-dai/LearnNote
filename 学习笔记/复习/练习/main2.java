package 练习;

public class main2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(System.currentTimeMillis());
        Thread.sleep(3*1000);
        System.out.println(System.currentTimeMillis());
    }
}
/*
执行结果：
        1578991732704
        1578991735704
*/