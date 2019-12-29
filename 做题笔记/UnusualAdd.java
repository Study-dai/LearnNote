package package1226;

import java.util.Scanner;

/*另类加法
编写一个函数将两个数字相加，不能使用+号或者其他算数运算符
请输出A+B的值

思路：肯定是用位运算，我记得位运算A^B是不考虑进位的结果，（A&B）<<1是求得的进位
因此A^B+（A&B）<<1的结果就是和，只要（A&B）<<1=0，两项就变成了一项，不需要加法了
*/

public class UnusualAdd {
    public static int addAB(int A, int B) {
      if(B!=0){
          int a=A^B;
          int b=A&B<<1;
          return addAB(a,b);
      }else{
          return A;
      }
    }
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        System.out.println(addAB(sc1.nextInt(), sc2.nextInt()));
    }
}
