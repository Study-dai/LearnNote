package Operation;
import Book.Book;
import Book.BookList;

public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入你要归还的书籍");
        Book book=null;
        String name = scanner.next();
        int i = 0;
        for (i = 0; i <bookList.getSize(); i++) {
            if (bookList.getBook(i).getName().equals(name)) {
                 book = bookList.getBook(i);
                break;
            }
        }
        if(i< bookList.getSize()){
            System.out.println("没有此书籍");
            return;
        }
        if(book!=null&& !book.isBorrowed()){
            System.out.println("此书没有被您借阅");
            return;
        }
        if(book!=null&& !book.isBorrowed()){
            book.setBorrowed(false);
        }
        System.out.println("归还完成");
    }
}