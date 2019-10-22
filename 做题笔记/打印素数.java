 打印 1 - 100 之间所有的素数 
public class Test {
	public static void main(String[] args) {
        int i=0;
        for(i=1;i<=100;i++){
            int j=0;
            for(j=2;j<=(i/2);j++){
                if(i%j==0)
                break;
                if(j>=(i/2)){
                    System.out.println(i);
                }
            }
        }
        }
    }