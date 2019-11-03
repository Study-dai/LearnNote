- 实现交换两个变量的值。要求：需要交换实参的值。
 public class Test {
    public static void main(String [] args){
        Calculator transfrom=new Calculator();
        transfrom.setNum1(10);
        transfrom.setNum2(20);
        System.out.println("num1:"+transfrom.getNum1()
                +"num2:"+transfrom.getNum2());
        //交换num1和num2的值
        int tmp=transfrom.getNum1();
        transfrom.setNum1(transfrom.getNum2());
        transfrom.setNum2(tmp);
        System.out.println("num1:"+transfrom.getNum1()
                +"num2:"+transfrom.getNum2());
    }
}

 class Calculator {
    private int num1;//私有成员
    private int num2;
    public  int getNum1() {//获得num1的方法
        return this.num1;
    }
    public void setNum1(int num1) {//设置num1的方法
        this.num1 = num1;
    }
    public int getNum2() {//获得num2的方法
        return this.num2;
    }
    public void setNum2(int num2) {//设置num2的方法
        this.num2 = num2;
    }
}
