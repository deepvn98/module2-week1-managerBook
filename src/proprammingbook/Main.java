package proprammingbook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book [] books = new Book[10];
        books[0] = new ProgrammingBook("sdffgxs", "javacor3e", 58700,"índf", "Java", "sgga");
        books[1] = new ProgrammingBook("sdffas", "javacore", 13500,"índf", "3va", "sgga");
        books[2] = new ProgrammingBook("sdfewfs", "javacore", 78000,"índf", "Jreva", "sgga");
        books[3] = new ProgrammingBook("sdffhes", "javacore", 23340,"índf", "Jtva", "sgga");
        books[4] = new ProgrammingBook("sdnffs", "javacore", 27000,"índf", "Jaw", "sgga");
        books[5] = new FictionBook("sdfsfs", "javacore", 20670,"índf", 342);
        books[6] = new FictionBook("sdfofe", "javacore", 45000,"índf", 1234);
        books[7] = new FictionBook("sdfdfs", "javacore", 45000,"índf", 1234);
        books[8] = new FictionBook("sdfsfs", "javacore", 45000,"índf", 1234);
        books[9] = new FictionBook("sdfhkfs", "javacore", 45000,"índf", 1234);
        ManageBook listBook = new ManageBook(books);
//        System.out.println("tổng giá tiền các đầu sách là : "+ listBook.getTotalPrice());
//        System.out.println("Số sách có ngôn ngữ java là:  "+listBook.getCountLanguage());

//Baitap thêm sửa xoá
        MyArrayBook manager = new MyArrayBook();
        Book o = new Book("dfnd", "sadsa",2944,"duhf");
            System.out.println(" nhấn 1 nếu bạn muốn thêm, 2 nếu bạn muốn sửa và 3 nếu bạn muốn xoá: ");
            int number = scanner.nextInt();

        switch (number){
            case 1:
                manager.disPlay( MyArrayBook.addBook(books,o,scanner));
                break;
            case 2:
                manager.disPlay( MyArrayBook.editBook(books,o,scanner));
                break;
            case 3:
                manager.disPlay( MyArrayBook.deleteBook(books));
                break;

        }
    }

}
