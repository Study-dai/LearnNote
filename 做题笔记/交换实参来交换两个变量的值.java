- ʵ�ֽ�������������ֵ��Ҫ����Ҫ����ʵ�ε�ֵ��
 public class Test {
    public static void main(String [] args){
        Calculator transfrom=new Calculator();
        transfrom.setNum1(10);
        transfrom.setNum2(20);
        System.out.println("num1:"+transfrom.getNum1()
                +"num2:"+transfrom.getNum2());
        //����num1��num2��ֵ
        int tmp=transfrom.getNum1();
        transfrom.setNum1(transfrom.getNum2());
        transfrom.setNum2(tmp);
        System.out.println("num1:"+transfrom.getNum1()
                +"num2:"+transfrom.getNum2());
    }
}

 class Calculator {
    private int num1;//˽�г�Ա
    private int num2;
    public  int getNum1() {//���num1�ķ���
        return this.num1;
    }
    public void setNum1(int num1) {//����num1�ķ���
        this.num1 = num1;
    }
    public int getNum2() {//���num2�ķ���
        return this.num2;
    }
    public void setNum2(int num2) {//����num2�ķ���
        this.num2 = num2;
    }
}
