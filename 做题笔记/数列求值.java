计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。 
public class Test {
	public static void main(String[] args) {
        int i=1;
        double sum=0;
        double k=1;
        for(i=1,sum=0;i<=100;i++){
            sum=sum+k/i;
            k=k*-1;
        }
        System.out.println(sum);
        }
    }
	//执行结果
	结果是00.688172179310195
