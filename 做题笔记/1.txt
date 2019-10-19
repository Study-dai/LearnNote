//1. 写代码实现: 给定两个 int 变量, 交换变量的值. 
public class Test{
   public static void main(String[] args){
   int a=10;
   int b=20;
    a=a^b;
    b=a^b;
    a=a^b;
   System.out.println(a);
   System.out.println(b);
   }
}