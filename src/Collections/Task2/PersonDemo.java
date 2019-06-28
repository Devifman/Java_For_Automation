package Collections.Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PersonDemo {
    public static void main(String[] args) {
        Person[] arr = new Person[]{
                new Person("Jimmy", 22),
                new Person("Richard", 41),
                new Person("Rose", 25),
                new Person("Anna", 36),
                new Person("Paper", 29)
        };
        ArrayList<Person> personComparableSort = new ArrayList<>();
        ArrayList<Person> personComparatorSort = new ArrayList<>();
        for (Person man : arr) {
            personComparableSort.add(man);
            personComparatorSort.add(man);
        }
        personComparableSort.remove(new Person("Jimmy", 22));
        personComparableSort.add(new Person("Bishop", 37));
        System.out.println("We need to sort our first list by Comparable");
        personComparableSort.forEach(x -> System.out.println(x));
        System.out.println();
        System.out.println("We need to  sort another list by Comparator");
        personComparatorSort.forEach(x -> System.out.println(x));
        System.out.println("Let's sort our first list");
        Collections.sort(personComparableSort);
        personComparableSort.forEach(x -> System.out.println(x));
        System.out.println();
        Collections.sort(personComparatorSort, new Person.NameSort().thenComparing(new Person.AgeSort()));
        System.out.println("Let's sort our second list");
        personComparatorSort.forEach(x -> System.out.println(x));
    }
}
