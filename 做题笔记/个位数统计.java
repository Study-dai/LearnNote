package package1223;
/*
个位数统计
给定一个k位整数N = dk-1*10k-1 + ... + d1*101 + d0 (0<=di<=9, i=0,...,k-1, dk-1>0)，
请编写程序统计每种不同的个位数字出现的次数。例如：给定N = 100311，则有2个0，3个1，和1个3。
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String N = sc.next();
            //转变成字符数组
            char[] chars = N.toCharArray();

            /**
             * list***有10个item表示0-9，每个item的值表示数字的个数
             */
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                list.add(0);//初始化每个item都是0
            }
            for (int i = 0; i < chars.length; i++) {
                // 每遇到一个数字，就把值+1
                list.set(chars[i]-'0',list.get(chars[i]-'0')+1);
            }
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i)>0){
                    System.out.println(i+":"+list.get(i));
                }
            }
        }
    }


