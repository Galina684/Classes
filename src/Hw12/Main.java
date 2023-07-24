package Hw12;

import Hw12.Author;
import Hw12.Book;

public class Main {
    public static void main(String[] args) {
        Book onegin = new Book("Александр Пушкин","Евгений Онегин", 1832);
        Book godunov = new Book("Александр Пушкин", "Борис Годунов", 1825);
        Author pushkin = new Author("Александр Пушкин");
        System.out.println(pushkin.getName());
        System.out.println(onegin.getTitle());
        System.out.println(onegin.getYear());
        onegin.setYear(1831);
        System.out.println(onegin.getYear());
        System.out.println(pushkin.getName());
        System.out.println(godunov.getTitle());
        System.out.println(godunov.getYear());

    }
}