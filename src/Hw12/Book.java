package Hw12;

import java.util.Objects;

public class Book {
    private Author author;
    private String title;
    private int year;


    public Book( Author author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year);
    }

    public String toString(){
        return  this.author + " Книга " + this.title + " год выпуска " + this.year;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle () {
            return title;
        }

        public int getYear () {
            return year;
        }

    public void setYear(int year) {
        this.year = year;
    }

}
