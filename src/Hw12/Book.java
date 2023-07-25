package Hw12;

public class Book {


    private String Author;
    private String title;
    private int year;


    public Book(String Author, String title, int year) {
        this.Author = Author;
        this.title = title;
        this.year = year;
    }


    public String getName() {
        return Author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
