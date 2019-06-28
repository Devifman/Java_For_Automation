package Collections.Task1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashS {
    public static void main(String[] args) {

        HashSet<String> cars = new HashSet<>();
        System.out.println("Lets add some cars");
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Audi");
        cars.add("Lada");
        cars.add("Nissan");
        cars.forEach(System.out::println);
        System.out.println();

        System.out.println("Now let's remove one car");
        cars.remove("Lada");
        cars.forEach(System.out::println);
        System.out.println();

        System.out.println("If we want to edit any element, we need to remove it, then add another one");
        cars.remove("BMW");
        cars.add("Renault");
        cars.forEach(System.out::println);
        System.out.println();

        System.out.println("Let's sort our collection");
        Set<String> sorter = new TreeSet<>(cars);
        sorter.forEach(System.out::println);


    }
}
