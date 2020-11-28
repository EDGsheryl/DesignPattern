package Iterator;

import java.util.ArrayList;

public class BookShelf implements Aggregate {
    private ArrayList<Book> books;
    private int length = 0;

    public void appendBook(Book book) {
        this.books.add(book);
        length++;
    }

    public Book getBookAt(int index) {
        return this.books.get(index);
    }

    public int getLength() {
        return this.length;
    }

    public BookShelf() {
        books = new ArrayList<Book>();
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
