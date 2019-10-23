 求两个正整数的最大公约数 
public class Test {
	public static void main(String[] args) {
        int a=15;
        int b=24;
        int c,d;
        if(a>b){
            c=a;
            a=b;
            b=c;
        }
        //如果a>b,交换a和b的值，使a<b.
       d=a%b;
       if(d!=0){
           a=b;
           b=d;
           d=a%b;
       }
       System.out.println("最大公约数是"+b);
    
        }
    }
	//执行结果
	最大公约数是:15
	