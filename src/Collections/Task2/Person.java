package Collections.Task2;

import java.util.*;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    Person() {
        name = "David";
        age = 25;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person comparedW) {
        return name.compareTo(comparedW.name);
    }

    @Override
    public String toString() {
        return "Name of the person is " + name + " and age of that person is " + age;
    }

    boolean Equals(Object comparedW) {
        if (comparedW == this) {
            return true;
        }
        if (!(comparedW instanceof Person)) {
            return false;
        }
        Person man = (Person) comparedW;
        return age == man.age && Objects.equals(name, man.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static class NameSort implements Comparator<Person> {
        @Override
        public int compare(Person com, Person comparedW) {
            return com.name.compareTo(comparedW.name);
        }

    }

    public static class AgeSort implements Comparator<Person> {
        @Override
        public int compare(Person com, Person comparedW) {
            if (com.age < comparedW.age) {
                return -1;
            } else {
                if (com.age > comparedW.age) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }

    private static boolean personExists(ArrayList<Person> comparedW, Person person) {
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
