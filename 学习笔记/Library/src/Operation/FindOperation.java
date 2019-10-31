package Operation;

import Book.BookList;
import Book.Book;
public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        //1、输入删除图书的名字
        System.out.println("查找书籍");
        System.out.println("请输入要查找图书的名字");
        String name =scanner.next();
        //2、根据书籍的名字查找书籍是否存在
        int count=0;
        int i=0;
        for (i = 0; i <bookList.getSize(); i++) {
            Book book=bookList.getBook(i);
            if(bookList.getBook(i).getName().equals(name) ){
                //如果相同就打印这本书的信息
                System.out.println(book);
                count++;
            }
        }
        if(i>bookList.getSize()){
            System.out.println("没有这本书");
           // return;
        }
        System.out.println("共计找到"+count+"本书");
    }
}
