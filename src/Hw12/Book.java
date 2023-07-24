package Hw12;

public class Book extends Author {
    private  String name;
   private String title;
   private int year;
   public Book(String name, String title, int year){
       super(name);
       this.title = title;
       this.year = year;
   }

    @Override
    public String getName() {
        return name;
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
