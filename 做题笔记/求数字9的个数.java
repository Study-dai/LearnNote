 ��д������һ�� 1�� 100 �����������г��ֶ��ٸ�����9�� 
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
       System.out.printf("һ��֮�ں���9�����ָ���Ϊ %d",count);
        }
    }