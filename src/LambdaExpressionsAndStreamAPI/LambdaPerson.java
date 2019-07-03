package LambdaExpressionsAndStreamAPI;
import Collections.Task2.Person;

import java.util.ArrayList;
import java.util.Comparator;

public class LambdaPerson {
    public static void main(String[] args){
        ArrayList <Person> somepersons = new ArrayList<>();

        somepersons.add(new Person("Eddie",21));
        somepersons.add(new Person("Frank",24));
        somepersons.add(new Person("Thomas",31));
        somepersons.add(new Person("Linda",25));
        somepersons.add(new Person("Grace",29));
        somepersons.add(new Person("Bell",20));

        System.out.println("The age must be more then 20 and less then 30");
        somepersons.stream().filter(person -> person.getAge()>20&& person.getAge()<30).forEach(System.out::println);
        System.out.println();
        System.out.println("All persons must be unique");
        somepersons.stream().distinct().forEach(System.out::println);
        System.out.println();
        System.out.println("Now Let's sort them by age");
        Comparator<Person>sizeName = Comparator.comparingInt(person->person.getName().length());
        somepersons.stream().sorted(sizeName)
                .forEach(System.out::println);

    }
}
