
public class Book {
    private String name;
    private String gender;
    private String author;
    private int pages;

    public Book(String name, String author, String gender, int pages) {
        this.name = name;
        this.author = author;
        this.gender = gender;
        this.pages = pages;

    } // end constructor

    public String getName() {
        return name;

    }

    public String getGender() {
        return gender;
    }

    public String getAuthor() {
        return author;
    }
    public int getPages(){
        return pages;
    }


}
