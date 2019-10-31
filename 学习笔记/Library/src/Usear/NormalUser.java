package Usear;
import Operation.*;

public class NormalUser extends User{
    public NormalUser(String name){
        super(name);
        //在这里构造operation数组
        //让数组中operation对象的顺序和菜单中的序号相对应
        this.name=name;
        this.operations=new IOperation[]{
          new Exitoperation(),
          new FindOperation(),
          new BorrowOperation(),
          new ReturnOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("=============================");
        System.out.println("Hello " + this.name + ", 欢迎使用图书管理系统!");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出程序");
        System.out.println("================================");
        System.out.println("请输入你的选择");
        int choice = scanner.nextInt();
        //close 本质上是在关闭 System.in
        //由于后面还需要用到System.in，此处不能关闭
        //scanner.close();
        return choice;
    }
}
