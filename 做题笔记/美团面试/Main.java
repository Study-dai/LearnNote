package 美团面试;


/*
双行道
题目描述：
有一个2*n的网格，有一个人位于(1,1)的位置，即左上角，他希望从左上角走到右下角，即(2,n)的位置。在每一次，他可以进行三种操作中的一种：
1． 向右走一格，即从(x,y)到(x,y+1);
2． 向上右方走一格，即，如果他在(2,y)的位置可以走到(1,y+1);
3． 向下右方走一格，即，如果他在(1,y)的位置可以走到(2,y+1);
问题当然不会这么简单，在这2*n的格子中，有一部分格子上有障碍物，他不能停在障碍物上，当然也不能走出网格，请问他有多少种不同的路线可以到达(2,n)。
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        Scanner sc3=new Scanner(System.in);
        int n=sc1.nextInt();
        String s1=sc2.nextLine();
        String s2=sc3.nextLine();
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        int count =0;
        for (int i = 0; i <n ; i++) {
            if((ch1[i]=='.'&&ch2[i+1]=='.')||ch1[i+1]=='.'||((ch2[i]=='.'&&ch2[i+1]=='.')||ch1[i+1]=='.')){
                count ++;
            }else{
                System.out.println(-1);
            }
        }
        System.out.println(count);
        sc1.close();
        sc2.close();
        sc3.close();
    }
}
