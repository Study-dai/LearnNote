 ���һ������������캯�����࣬���ֱ�����Щ���캯��������ʵ�������� 
public class Test {
    public static void main(String [] args) {
        Person sustdai=new Person("dai  ","��  ",19);
        sustdai.show();
        Person sustzhao=new Person("zhao","nan",12);
        sustzhao.eat();
        sustdai.sleep();
    }
}

����Person ��
public class Person {
    private String name;
    private String sex;
    private int age;

    //���췽��
    public Person(String name){
        this.name=name;
    }
    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public void show(){
        System.out.println("����:"+name+"�Ա�:"+
                sex+"����:"+age);
    }
    //��ͨ����
    public void eat(){
        System.out.println(this.name+"�Է�");
    }
    public void sleep(){
        System.out.println(this.name+"˯��");
    }
}

