package Collections.Task2;

import java.util.*;

public class Person implements Comparable<Person> {
    public String name;
    public int age;

    Person() {
        name = "David";
        age = 22;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person person) {
        return name.compareTo(person.getName());
    }

    @Override
    public String toString() {
        return "Name of the person is " + name + " and age of that person is " + age;
    }

    boolean Equals(Object someobj) {
        if (someobj == this) {
            return true;
        }
        if (!(someobj instanceof Person)) {
            return false;
        }
        Person man = (Person) someobj;
        return age == man.age && Objects.equals(name, man.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static class NameSort implements Comparator<Person> {
        @Override
        public int compare(Person com, Person com2) {
            return com.name.compareTo(com2.name);
        }

    }

    public static class AgeSort implements Comparator<Person> {
        @Override
        public int compare(Person com, Person com2) {
            return com.age - com2.age;
        }
    }

    public static boolean personExists(ArrayList<Person> comparedW, Person person) {
        boolean exists = false;
        for (Person x : comparedW) {
            exists = true;
        }
        return exists;
    }

    public static ArrayList<Person> checkUniqueness(ArrayList<Person> uniqueness) {
        HashSet<Person> personHashSet = new HashSet<>(uniqueness);
        return new ArrayList<>(personHashSet);
    }

    public static boolean listOfCompare(ArrayList<Person> one, ArrayList<Person> two) {
        if (one.size() != two.size()) {
            return false;
        }
        ArrayList<Person> compareTo = new ArrayList<>();
        ArrayList<Person> compareW = new ArrayList<>();
        for (Person man : one) {
            if (personExists(compareW, man)) {
                compareTo.remove(man);
                compareW.remove(man);
            }
        }
        if (compareTo.size() == compareW.size() && compareTo.size() == 0) {
            return true;
        } else return false;
    }
}
