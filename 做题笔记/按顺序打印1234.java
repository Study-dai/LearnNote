实现代码: 按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) 
public class Test{
    public static void main(String[] args) {
        int num=1234;
        printNum(num);
    }
    public static void printNum(int num){
        if(num>9){
            printNum(num/10);
        }
        System.out.println(num%10);
    }
}
