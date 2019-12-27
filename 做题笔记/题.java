package package1215;

import java.util.Scanner;

public class Main2 {
    public static int Apple(int n) {
        if(n<=5){
            return -1;
        }
        if(n%8==0){
            return n/8;
        }else if((n%8)%2==0&&n!=10){
            return n/8+1;
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(Apple(sc.nextInt()));
    }
}
