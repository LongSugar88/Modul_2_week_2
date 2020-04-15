package Course;

import java.util.Scanner;

public class RunMainBookClass {
    public static void main(String[] args) {
        ProgramingBook proBook1 = new ProgramingBook(0.901,"Thousand and one nights 1 ",80000,"no author","PHP", 3);
        ProgramingBook proBook2 = new ProgramingBook(7.002,"Thousand and one nights 2 ",80000,"no author","Java", 3);
        ProgramingBook proBook3 = new ProgramingBook(5.503,"A thousand and one nights 3",80000,"no author","PHP", 3);
        ProgramingBook proBook4 = new ProgramingBook(0.104,"Thousand and one nights 4",80000,"no author","Java", 3);
        ProgramingBook proBook5 = new ProgramingBook(2.005,"Thousand and one nights 5",80000,"no author","PHP", 3);
        FictionBook proBook6 = new FictionBook(0.906,"Harry Potter 1 ",90000,"Rowling","Java", 4,"Hero");
        FictionBook proBook7 = new FictionBook(1.107,"Harry Potter 2 ",90000,"Rowling","Java", 4,"Hero");
        FictionBook proBook8 = new FictionBook(1.058,"Harry Potter 3 ",90000,"Rowling","Java", 4,"Hero");
        FictionBook proBook9 = new FictionBook(3.009,"Harry Potter 4 ",90000,"Rowling","Java", 4,"Hero");
        FictionBook proBook10 = new FictionBook(8.0010,"Harry Potter 5 ",90000,"Rowling","Java", 4,"Hero");
        CheckPrice checkPrice = new CheckPrice();

        CheckAuthor checkAuthor = new CheckAuthor();
        CheckID checkID = new CheckID();
        Scanner scan = new Scanner(System.in);
        //Lập mảng phần tử
        Book listBook[]  = {proBook1, proBook2, proBook3,proBook4, proBook5, proBook6,proBook7, proBook8, proBook9, proBook10};
        //Sắp xếp danh sách
        for (int i=0; i<listBook.length-1; i++){
            for (int j=0; j<listBook.length-1; j++ ){
                if(listBook[j].getName().charAt(0) > listBook[j+1].getName().charAt(0)){
                    Book t = listBook[j];
                    listBook[j] = listBook[j+1];
                    listBook[j+1] = t;
                }
            }
        }
//        Chạy tìm kiếm theo lựa chọn
        int choose = 0;
        while (choose != 10){
            System.out.println("1. Check book's code");
            System.out.println("2. Check price");
            System.out.println("3. Check author");
            System.out.println("0. Exit");
            System.out.println("Enter a number correspond a function's name above: ");
            choose = scan.nextInt();
            scan.nextLine();
            switch (choose){
                case 1:
                    System.out.println("Enter a book's name to find: ");
                    String nameCode = scan.nextLine();
                    checkID.check(nameCode, listBook);
                    break;
                case 2:
                    System.out.println("Enter a book's name to find: ");
                    String namePrice = scan.nextLine();
                    checkPrice.check(namePrice, listBook);
                    break;
                case 3:
                    System.out.println("Enter a book's name to find: ");
                    String nameAu = scan.nextLine();
                    checkAuthor.check(nameAu, listBook);
                    break;
                case 4:
                    System.exit(4);
                default: System.out.println("not available");
        }

        }

    }
}
