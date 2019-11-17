package package1112;
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
public class yangH {
    public static void main(String[] args) {
            int temp=0;
        int n = 10;//行数
        Integer last;//最后一行变量
        int k = 0;
        Queue<Integer> query = new LinkedList<Integer>();
        query.offer(1);// 第一行入队
        for (int i = 2; i <= n; i++) {// 产生第n行对象并入队，同时打印第n-1行的对象
            /**
             * 打印每行开头的空白
             */
            System.out.print("\t");
            while (k < (n - i) / 2) {
                k++;
                System.out.print("\t" + "\t");
            }
            if (i % 2 == 1) {
                System.out.print("\t");
            }
            query.offer(1);// 第n行的第一个对象入队
            for (int j = 0; j < i - 2; j++) {
                temp = query.poll();
                System.out.print(temp + "\t" + "\t");// 打印n-1行的对象
                temp += query.peek();
                query.offer(temp);// 利用队中第n-1行对象产生第n行对象
            }
            k = 0;
            System.out.println(query.poll());// 第n-1行的最后一个对象出队
            query.offer(1);// 第n行的最后一个对象入队

        }
// 打印最后一行
        while ((last = query.poll()) != null) {
            System.out.print(last + "\t" + "\t");
        }
    }
}
