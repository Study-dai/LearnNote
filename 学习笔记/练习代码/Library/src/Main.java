import Book.BookList;

import java.util.Scanner;
import Usear.User;
import Usear.Admin;
import Usear.NormalUser;
public class Main {
    public static void main(String [] args){
        //程序入口
        //1、先准备好书籍信息数据
        BookList bookList=new BookList();
        //2、创建用户(注意体会这里的多态）
        User user=login();
        //3.进入主循环
        while(true){
            int choice = user.menu();
            user.doOperation(choice,bookList);
        }
    }
    public static User login(){
        System.out.println("请输入你的姓名：");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        System.out.println("请输入您的身份（1 表示管理员，0表示普通用户）：");
        int choice =scanner.nextInt();
        //判断用户身份
        if(choice==1){
            return new Admin(name);
        }else{
            return new NormalUser(name);
        }
    }
}
