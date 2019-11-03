package Operation;

import Book.BookList;

public class DisplayOperation implements IOperation{
    @Override
public void work(BookList bookList){
    int size=bookList.getSize();
    for (int i = 0; i <size; i++) {
        System.out.print(bookList.getBook(i));
      }
        System.out.println("共计"+bookList.getSize()+"本书");
    }
}
