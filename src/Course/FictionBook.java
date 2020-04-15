package Course;

public class FictionBook extends ProgramingBook {
    private String category = "Detective";

    FictionBook(){

    }
    FictionBook(double bookCode, String name, double price, String author, String language, int frameWork, String category){
        super(bookCode,name, price, author,language,frameWork);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    FictionBook getInfor(){
            return this;
    }

}
