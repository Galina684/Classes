package Hw12;

public class Main {
    public static void main(java.lang.String[] args) {
        Book onegin = new Book("Александр Пушкин","Евгений Онегин", 1832);
        Book godunov = new Book("Александр Пушкин", "Борис Годунов", 1825);
        Book dogsHeart = new Book ("Михаил Булгаков", "Собачье сердце", 1925);
        System.out.println(onegin.getName());
        System.out.println(onegin.getTitle());
        System.out.println(onegin.getYear());
        onegin.setYear(1831);
        System.out.println(onegin.getYear());
        System.out.println(godunov.getName());
        System.out.println(godunov.getTitle());
        System.out.println(godunov.getYear());
        System.out.println(dogsHeart.getName());
        System.out.println(dogsHeart.getTitle());
        System.out.println(dogsHeart.getYear());

    }
}