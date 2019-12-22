package package1222;

public class CRLFDemo {
    public static void main(String[] args)throws InterruptedException {
        int p=1;
        /*
        System.out.println("你好中国\r你好世界");
        //回到行首，相当于覆盖掉你好中国
        */
        while(true){
            System.out.printf("当前下载进度%d%%\r",p);
            p++;
            Thread.sleep(100);
        }
    }
}
