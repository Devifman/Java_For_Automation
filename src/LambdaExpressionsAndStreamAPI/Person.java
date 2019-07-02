package LambdaExpressionsAndStreamAPI;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    String getName(){return name;}
    int getAge(){return age;}
    public int compareTo(Person person){
        return Integer.compare(this.age,person.age);
    }
}
