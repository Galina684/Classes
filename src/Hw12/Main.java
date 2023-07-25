package Hw12;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Александр Пушкин");
        Author author2 = new Author("Михаил Булгаков");
        Book book1 = new Book(author1, "Борис Годунов", 1825);
        Book book2 = new Book(author1, "Евгений Онегин", 1832);
        Book book3 = new Book(author2, "Собачье сердце", 1925);
        System.out.println(author1.getAuthor());
        System.out.println(book1.getTitle());
        System.out.println(book1.getYear());
        System.out.println(author1.getAuthor());
        System.out.println(book2.getTitle());
        System.out.println(book2.getYear());
        book2.setYear(1831);
        System.out.println(book2.getYear());
        System.out.println(author2.getAuthor());
        System.out.println(book3.getTitle());
        System.out.println(book3.getYear());

    }
}