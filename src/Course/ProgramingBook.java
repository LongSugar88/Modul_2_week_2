package Course;

public class ProgramingBook extends Book {
    private String language = "Java";
    private int frameWork = 1;

    ProgramingBook(){

    }
    ProgramingBook(double bookCode, String name, double price, String author, String language, int frameWork){
        super(bookCode,name, price, author);
        this.language = language;
        this.frameWork = frameWork;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getFrameWork() {
        return frameWork;
    }

    public void setFrameWork(int frameWork) {
        this.frameWork = frameWork;
    }

}
