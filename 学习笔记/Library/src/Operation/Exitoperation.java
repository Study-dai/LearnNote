package Operation;

import Book.BookList;

public class Exitoperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("程序退出 goodbye!");
        System.exit(0);
        // System.exit(0);类似于return 0，0表示成功，非0表示失败
    }
}
