package package1;
import java.util.Scanner;
public class main {
    //判断一个字符串中是否全部由数字组成
    public static boolean isNumber(String str){
        char[] data=str.toCharArray();
        for (int i = 0; i <data.length; i++) {
            if(data[i]<'0'||data[i]>'9'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(isNumber(sc.nextLine()));
    }
}
