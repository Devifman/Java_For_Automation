package Generics.FirstTask;

import InnerAndAbstractClassesAndInterfaces.p1Shapes.Task1.Circle;

public class PairDemo {
    public static void main(String[] args){
        Pair<String,Circle> objectPair= new Pair<String, Circle>("Here is a Circle", new Circle());
        System.out.println(objectPair.getFirst());
        System.out.println(objectPair.getSecond());

    }
    }

