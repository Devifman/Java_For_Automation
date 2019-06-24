package InheritanceAndPolymorphism;

import java.util.Arrays;

public class MathDemo {
    public static void main (String[] args) {
        int []arr = new int[]{1,2,3,4,5};
        MathUtil Object1 = new MathUtil(arr);
        System.out.println("Minimum is "+Object1.minimum(arr));
        MathUtil checkmaximum = new MathUtil(arr);
        System.out.println("Maximum is "+Object1.maximum(arr));
         int nextafternum = 3;
         MathUtil Object2 = new MathUtil(arr,nextafternum);
        System.out.println("Here's nextAfter method "+Object2.nexAfter(arr,3));
        System.out.println("Now time for DOUBLE");




        }

}
