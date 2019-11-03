 编写一个类Calculator,有两个属性num1,num2,这两个数据的值，不能在定义的同时初始化，最后实现加减乘除四种运算. 
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
                System.out.println("除数不能为0");
            }else{
                System.out.println(x/y);
            }
        }
    }