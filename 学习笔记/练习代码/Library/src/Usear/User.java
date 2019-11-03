package Usear;

import Book.BookList;

import Operation.IOperation;

import java.util.Scanner;

public abstract class  User {
    protected String name;
    //持有当前用户支持的操作对象
    protected IOperation [] operations;

    public User(String name) {
        this.name = name;
    }

    Scanner scanner=new Scanner(System.in);
    //打印一个操作菜单，不同的用户，支持的操作不同，对应的菜单也就不同
    abstract public int menu();
    //根据用户输入的选项（menu返回结果）
    //调用对应的操作对象
    //此处注意多态在这个代码中的体现
    public void doOperation(int choice,BookList bookList){
        operations[choice].work(bookList);
    }
}
