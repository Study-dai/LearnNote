 设计一个包含多个构造函数的类，并分别用这些构造函数来进行实例化对象。 
public class Test {
    public static void main(String [] args) {
        Person sustdai=new Person("dai  ","男  ",19);
        sustdai.show();
        Person sustzhao=new Person("zhao","nan",12);
        sustzhao.eat();
        sustdai.sleep();
    }
}

创建Person 类
public class Person {
    private String name;
    private String sex;
    private int age;

    //构造方法
    public Person(String name){
        this.name=name;
    }
    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public void show(){
        System.out.println("名字:"+name+"性别:"+
                sex+"年龄:"+age);
    }
    //普通方法
    public void eat(){
        System.out.println(this.name+"吃饭");
    }
    public void sleep(){
        System.out.println(this.name+"睡觉");
    }
}

