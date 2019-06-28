package Collections.Task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(28);
        arr.add(35);
        arr.add(15);
        System.out.println("We add few elements");
        arr.forEach(System.out::println);
        System.out.println();

        arr.set(0, 88);
        arr.set(1, 99);
        arr.set(2, 61);
        System.out.println("We Change elements params");
        arr.forEach(System.out::println);
        System.out.println();

        arr.remove(0);
        arr.remove(1);
        System.out.println("We delete first and last params");
        arr.forEach(System.out::println);
        System.out.println();

        arr.add(33);
        arr.add(54);
        arr.add(30);
        arr.add(10);
        System.out.println("We add some new elements");
        arr.forEach(System.out::println);
        System.out.println("And sorted it");
        Collections.sort(arr);
        arr.forEach(System.out::println);
        System.out.println();

        System.out.println("Let's iterate through the collection");
        Iterator iter = arr.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next() + " ");

        }

    }
}
