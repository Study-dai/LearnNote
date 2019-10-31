package Operation;
import Book.Book;
import Book.BookList;

import java.util.Scanner;

//借出的类
public class BorrowOperation  implements  IOperation{
 @Override
 public void work(BookList bookList){
     System.out.println("借阅书籍！");
     //1.输入需要借阅书籍的名称
     Scanner scanner=new Scanner(System.in);
     System.out.println("请输入要借阅的书名：");
     String name=scanner.next();
     //2.根据书籍名称查找书籍是否存在
     int i;
     for ( i = 0; i <bookList.getSize(); i++) {
         Book book=bookList.getBook(i);
         if(book.getName().equals(name)){
             //如果为真，则说明找到了相同的name,则要找的书就存在
             continue;
         }
     }
     //3.拿到书籍的对象，将书籍对象的isBorrowed=true
     if(i<bookList.getSize()){//此时i为借阅的书籍下标
         System.out.println("没找到此书");
         return;
     }//找到指定图书的位置 没找到直接返回
        Book book = bookList.getBook(i);
     if(book.isBorrowed()){
         System.out.println("此书已经被借出！");
     }else{
         book.setBorrowed(true);
         System.out.println("借阅成功");
     }
 }
}
