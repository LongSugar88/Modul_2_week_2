package Course;

public class Book {
    private double bookCode = 0000;
    private String name = "no name";
    private double price = 100000;
    private String author = "no author";
    static Book listBook[] = new Book[10];
    static int n = 0;

    public Book(){

    }
    public Book(double bookCode, String name, double price, String author){
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public double getBookCode() {
        return bookCode;
    }

    public void setBookCode(double bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
