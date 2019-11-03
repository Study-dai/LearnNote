package Operation;

import Book.Book;

import Book.BookList;

import java.util.Scanner;

//新增图书
public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        System.out.println("新增书籍");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入名称：");
        String name =scanner.next();
        System.out.println("请输入作者：");
        String author =scanner.next();
        System.out.println("请输入价格：");
        int price=scanner.nextInt();
        System.out.println("请输入类型：");
        String type=scanner.next();
        //根据输入的书籍信息，构成一本书的对象
        Book book=new Book(name,author,price,type);
        //插入到bookList当中 尾插法
        int size= bookList.getSize();
        //尾插法
        bookList.setBook(size,book);
        bookList.setSize(size+1);
    }
}
