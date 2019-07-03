package LambdaExpressionsAndStreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Arrays;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static Comparator<Person> sortbyName = Comparator.comparing(Person::getName);

    public static List<Person> checkUniqueness(List<Person> person){
        person = new ArrayList<>(new HashSet<>(person));
        return person;
    }
//Name matching
    public static boolean recurrence (List<Person> p1, List<Person> p2){
        if(p1.size() != p2.size())
            return false;
        int res = 0;
        int size = p1.size();

        for (Person i : p1) {
            for (Person j : p2) {
                if (sortbyName.compare(i,j) == 0)
                    res++;
            }
        }

        return res == size;
    }

    //SortNames
    public static List<Person> nameSorting(List<Person> person){
        String[] strings = new String[person.size()];
        List<Person> personList = new ArrayList<>();
        for(int i = 0; i < person.size(); i ++){
            strings[i] = person.get(i).getName();
        }
        Arrays.sort(strings);
        boolean[] isAperson = new boolean[person.size()];
        for (String string : strings) {
            for (int j = 0; j < person.size(); j++) {
                if (string.equals(person.get(j).getName()) && !isAperson[j]) {
                    personList.add(person.get(j));
                    isAperson[j] = true;
                    break;
                }
            }
        }
        return personList;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }




    @Override
    public String toString() {
        return "Name of that person is " + this.name + ", and age of that person " + this.age;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null || obj.getClass() != this.getClass())
            return false;
        return this.getName().equals(((Person) obj).getName()) && ((Person) obj).getAge() == this.getAge();
    }

    @Override
    public int hashCode() {
        return name.hashCode() + (age > 10 ? 15 : 27);
    }
    @Override
    public int compareTo(Person person) {
        return Integer.compare(this.age, person.age);
    }

    public void setName(String name) {
        this.name = name;
    }
}
