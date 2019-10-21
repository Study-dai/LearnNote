import java.util.Random;
import java.util.Scanner;
public class CSZ{
    public static void main(String[] args) {
        Random random=new Random();//默认随机种子是系统时间
    Scanner sc=new Scanner(System.in);
    int toGuss=random.nextInt(100);
    while(true){
        System.out.println("请输入要猜的数字：（1-100）");
        int num=sc.nextInt();
        if(num<toGuss){
            System.out.println("猜小了");
        }else if(num>toGuss){
            System.out.println("猜大了");
        }else{
            System.out.println("猜对了");
            break;
        }
    }
    sc.close();
    }
}
//输出结果请输入要猜的数字：（1-100）
先用  javac CSZ.java -encoding utf8编译，编译通过
然后用 java CSZ执行
1
猜小了
请输入要猜的数字：（1-100）
50
猜大了
请输入要猜的数字：（1-100）
34
猜大了
请输入要猜的数字：（1-100）
23
猜小了
请输入要猜的数字：（1-100）
29
猜大了
请输入要猜的数字：（1-100）
26
猜小了
请输入要猜的数字：（1-100）
27
猜小了
请输入要猜的数字：（1-100）
28
猜对了