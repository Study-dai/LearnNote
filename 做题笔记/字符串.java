package package1225;

import java.util.Scanner;

public class Main2 {
    public static long func(long a,long b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        Scanner s2=new Scanner(System.in);
        String x=s1.nextLine();
        String y=s2.nextLine();
        char[] cx=x.toCharArray();
        char[] cy=y.toCharArray();
        long tx=0;
        long ty=0;
        for (int i = 0; i <cx.length-1 ; i++) {
            long fx=cx[i]*10^i;
            tx+=fx;
        }
        for (int i = 0; i <cy.length-1 ; i++) {
            long fy=cx[i]*10^i;
            ty+=fy;
        }
        long ret=func(tx,ty);
        int count=0;//表示位数，也表示接下来转成数字的字符串的数组长度
       while(ret%10<10){
           ret=ret%10;
           count++;
       }
        long [] arr=new long[count];
        for (int i = 0; i <=count ; i++) {
            arr[i]=ret/(10^(count-i));
        }
        System.out.println(arr.toString());
    }
}
