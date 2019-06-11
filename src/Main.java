package com.company;

public class Main {
    //the method that takes 2 integer arguments and returns the lowest;
    public static int counter(int x, int y) {
        if (x < y)
            return x;
        else {
            return y;

        }
    }
    //the method that takes 3 integer arguments and returns the lowest (using the first method);
    public static int counter2(int x, int y, int z) {
        if (counter(x,y)<z) {
            return counter(x,y);
        }
        else {
            return z;
        }
    }
    //the method that takes 4 integer arguments and returns the lowest (using the previous method)
    public static int counter3(int x, int y, int z, int w) {
        if (counter2(x,y,z)<w) {
            return counter2(x,y,z);
        }
        else return w;
    }


    public static void main (String[]args){
        System.out.println("This Number is Lowest " + counter(5, 2));
        System.out.println("This Number is Lowest " + counter2(5, 2,1));
        System.out.println("This Number is Lowest " + counter3(10, 20,30,5));



    }
}


