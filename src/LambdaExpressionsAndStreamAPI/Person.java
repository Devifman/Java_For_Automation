package LambdaExpressionsAndStreamAPI;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int checker;
    Person(String name,int age, int checker){
        this.name = name;
        this.age = age;
        this.checker = checker;
    }
    String getName(){return name;}
    int getAge(){return age;}
    public int compareTo(Person person){
        return Integer.compare(this.age,person.age);
    }
}
