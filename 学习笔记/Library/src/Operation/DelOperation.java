package Operation;

import Book.Book;
import Book.BookList;

public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        System.out.println("删除图书!");
        //1、输入删除图书的名字
        System.out.println("请输入要删除图书的名字：");
        String name =scanner.next();
        //2、根据书籍的名字查找书籍是否存在
        int i=0;
        for (i = 0; i <bookList.getSize(); i++) {
            if(bookList.getBook(i).getName().equals(name) ){
                //找到了
                break;
            }
        }
        if(i>=bookList.getSize()){
            System.out.println("没有要删除的书籍");
            return;
        }
        //3、处理找到了的情况 进行尾部删除 删除的逻辑 i=i+1;  对象
        //1、拿到i+1下标的对象
        //2、把i+1下标的对象赋值给i
        for(int j = i; j<bookList.getSize()-1; j++){
            Book book =bookList.getBook(j+1);
            bookList.setBook(j,book);
        }
        bookList.setSize(bookList.getSize()-1);
        System.out.println("删除成功");
    }
}
