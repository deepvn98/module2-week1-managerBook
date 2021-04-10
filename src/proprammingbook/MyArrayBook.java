package proprammingbook;

import java.util.Scanner;

public class MyArrayBook {
    private Book[] book1;

    public MyArrayBook() {
    }

    public Book[] getBook1() {
        return book1;
    }

    public void setBook1(Book[] book1) {
        this.book1 = book1;
    }
    public static Book[] addBook (Book[] books, Book book, Scanner scanner){
        Book [] arr = new Book[books.length + 1];
        System.out.println(" bạn muốn thêm sách vào vị trí nào: ");
        int x = scanner.nextInt();
        for ( int i = 0; i < x; i++ ){
            arr[i] = books[i];
        }
        arr[x] = book  ;
        for ( int i = x; i < books.length; i++ ){
            arr[i +1] = books[i];
        }return arr;
    }
   public static Book[] deleteBook(Book[] books){
       System.out.println("nhập tên sách bạn muốn xoá: ");
        String name = new Scanner(System.in).nextLine();
        Book[]arr =new Book[books.length];
        int n = 0;
        for ( int i = 0; i < books.length; i++ ){
            if ( books[i].getName() !=name){
                arr[n]= books[i];
                n++;
            }
        }return arr;
   }
   public static Book[] editBook(Book[] books, Book book, Scanner scanner){
        Book[]arr = new Book[books.length+1];
       System.out.println(" Mời bạn nhập vị trí muốn sửa: ");
        int index = scanner.nextInt();
        for (int i = 0; i < index ; i++){
            arr[i] = books[i];
        }
        arr[index]= book;
        for ( int i = index+1; i < books.length; i++ ){
            arr[ i] = books[i];
        }
        return arr;

   }
    public void disPlay(Book [] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}
