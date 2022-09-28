public class Book {
    private String name;
    private int year;
    Author author;

    public Book(String name , int year , Author author) {
        this.name = name;
        this.author = author;
        this.year = year;
    }
    public Author getAuthor(){
        return author;
    }
    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
