package Collections.Task3;

import java.util.Iterator;

public class Demo {
    public static void main(String[] args){
        CustomLinkedList testList = new CustomLinkedList();
        //add some elements
        testList.add(24);
        testList.add(11);
        testList.add(68);
        ///delete one element
        testList.delete(11);
        //reverse elements
        testList.begin = testList.reverse(testList.begin);
        Iterator <Integer> iterator = testList.iterator();
        while (iterator.hasNext()){
            int element = iterator.next();
            System.out.println("Here is a current element "+element);
        }
    }
}
