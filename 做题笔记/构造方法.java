 ��дһ����Calculator,����������num1,num2,���������ݵ�ֵ�������ڶ����ͬʱ��ʼ�������ʵ�ּӼ��˳���������. 
public class Test {
    public static void main(String [] args){
        Calculator realize=new Calculator();
        realize.add(1,2);
        realize.subtract(3,2) ;
        realize.ride(4,5);
        realize.divide(0,7);
    }
}

public class Calculator {
    private int num1;
    private int num2;
    public void add(int x,int y){
        System.out.println(x+y);
    }
    public void subtract(int x,int y){
        System.out.println(x-y);
    }
    public void ride(int x,int y){
        System.out.println(x*y);
        }
        public void divide(int x,int y){
            if(x==0){
                System.out.println("��������Ϊ0");
            }else{
                System.out.println(x/y);
            }
        }
    }