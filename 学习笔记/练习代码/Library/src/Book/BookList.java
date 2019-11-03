package Book;

public class BookList {
    private Book[] books=new Book[100];
    private int size;

    public BookList(){
        books[0]=new Book("java编程","代",19,"学习");

        books[1]=new Book("C++编程","召",12,"学习");

        books[2]=new Book("python编程","勇",16,"学习");

        size =3;
    }
    //Book的get和set方法不能自动生成，因为这里要加一个pos下标
    public Book getBook(int pos) {
        return this.books[pos];
    }

    public void setBook(int pos,Book book) {
        this.books[pos] = book;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
