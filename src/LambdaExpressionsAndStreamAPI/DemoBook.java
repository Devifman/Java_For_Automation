package LambdaExpressionsAndStreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DemoBook {
    public static void main(String[] args) {
        List<Book> libary = new ArrayList<Book>() {{
            add(new Book("The Lady of the Lake", new Author("Andrzej", "Sapkowski"), 58.30));
            add(new Book("he Gentleman from San Francisco", new Author("Ivan", "Bunin"), 33.10));
            add(new Book("Jonathan Livingston Seagull", new Author("Alexander", "Kuprin"), 42.14));
            add(new Book("The Lady of the Lake", new Author("Richard", "Bach"), 51.50));
            add(new Book("Gone with the Wind", new Author("Margaret", "Mitchell"), 36.62));
        }};
        System.out.println("Most expensive book is ");
        double expbook = libary.stream().mapToDouble(Book::getPrice).max().getAsDouble();
        System.out.println(expbook);
        System.out.println();
        System.out.println("Let's sort by Author");
        libary.stream().sorted(Comparator.comparing(book -> book.getAuthor().getFullname())).forEach(System.out::println);
        System.out.println();
    }

}
