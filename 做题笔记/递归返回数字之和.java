 实现代码: 写一个递归方法，输入一个非负整数，返回组成它的数字之和. 
//写一个方法//输入一个整数//返回组成他们的数字之和
public class Test{
    public static void main(String[] args) {
        int num =1729;
        int sum=ret(num);
        System.out.println(sum);
    }
    //起始（结束）条件：当num为个位数的时候，num=9；
    //递归公式：num%10+（num/10）
    public static int ret(int num){
        if(num<10){
            return num;
        }
        return num%10+ret(num/10);
    }
}
