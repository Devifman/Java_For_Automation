package Collections.Task1;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Que {
    public static void main(String[] args) {
        Queue<String> names = new PriorityQueue<String>() {
            {
                System.out.println("Let's Add some names");
                add("Bill");
                add("Frank");
                add("Grace");
                add("Lauren");

            }
        };
        Iterator<String> iter = names.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("Let's remove some names");
        names.remove("Frank");
        names.remove("Grace");
        Iterator iter2 = names.iterator();
        while (iter2.hasNext()) {
            System.out.println(iter2.next());
        }
    }
}
