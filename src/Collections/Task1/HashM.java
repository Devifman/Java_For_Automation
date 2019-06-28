package Collections.Task1;

import java.awt.*;
import java.util.*;

public class HashM {
    public static void main(String[] args){
        HashMap<String,Integer> teas = new HashMap<String, Integer>();

        System.out.println("Let's add some teas");
        teas.put("Lipton",150);
        teas.put("Greenfield",131);
        teas.put("Ahmad",288);
        teas.put("Princess Java",100500);
        for (Map.Entry<String,Integer> item : teas.entrySet()){
            System.out.println("Tea: "+ item.getKey()+"Price: "+ item.getValue());
        }
        System.out.println();
        System.out.println("Now we change some params");
        teas.replace("Lipton",150,220);
        for (Map.Entry<String,Integer> item : teas.entrySet()) {
            System.out.println("Tea: " + item.getKey() + "Price: " + item.getValue());
        }
            System.out.println();
            System.out.println("Let's delete one tea");
            teas.remove("Greenfield");
            System.out.println();
            System.out.println("Time to sort our teas by price");
            SortedMap<String, Integer> sortedTeas = new TreeMap<>(teas);

            System.out.println();
            for (Map.Entry<String,Integer> sortedTea: teas.entrySet()){
                System.out.println("Tea: "+sortedTea.getKey()+"Price: "+sortedTea.getValue());
                System.out.println();
            }




    }
}
