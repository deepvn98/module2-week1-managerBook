package proprammingbook;

import java.util.Scanner;

public class ManageBook {
    private Book[] books;

    public ManageBook() {
    }

    public ManageBook(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
    public double getTotalPrice (){
        double count = 0;
        for( int i = 0; i < books.length; i++ ){
            count += books[i].getPrice();
        }
        return count;
    }
    public int getCountLanguage(){
         int coutn = 0;
        for ( int i = 0; i < books.length; i++ ){
            if (books[i] instanceof ProgrammingBook){
                ProgrammingBook o = (ProgrammingBook) books[i];
                if ( o.getLanguage().equalsIgnoreCase("java")) coutn++;
            }
        }return coutn;
    }



}
