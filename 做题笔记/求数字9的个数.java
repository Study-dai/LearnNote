 编写程序数一下 1到 100 的所有整数中出现多少个数字9。 
public class Test {
	public static void main(String[] args) {
       int i=0;
       int count=0;
       for(i=1;i<100;i++){
        if(9==i%10){
            count++;
        }
     if(9==i/10){
        count++;
     }
       }
       System.out.printf("一百之内含有9的数字个数为 %d",count);
        }
    }