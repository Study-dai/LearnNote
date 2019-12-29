package package1223;

import java.util.Scanner;

public class Robot {
    public static int countWays(int x, int y) {
        if(x==1||y==1) {
            return 1;
        }
        return countWays(x-1,y)+countWays(x,y-1);
    }

    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        int a=sc1.nextInt();
        int b=sc2.nextInt();
        int ret= (int) countWays(a,b);
        System.out.println(ret);
    }
}
