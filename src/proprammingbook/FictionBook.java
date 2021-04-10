package proprammingbook;

public class FictionBook extends Book {
    protected double category;

    public FictionBook() {
    }

    public FictionBook(String bookCode, String name, double price, String author, double category) {
        super(bookCode, name, price, author);
        this.category = category;
    }
}
