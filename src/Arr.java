import java.util.Arrays;
import java.util.Scanner;
public class Arr {
    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println("Enter an size of Array");
        Scanner sc = new Scanner(System.in);
        int arraysize = sc.nextInt();
        int counter;
        int arr[] = new int[arraysize];
        for (counter = 0; counter < arr.length; counter++) {
            arr[counter] = (int) (Math.random() * arraysize);

        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {


        }
        System.out.println("Enter a number to search");
        int searchnum = sc.nextInt();
        long regstarttime = System.nanoTime()-start;
        System.out.println("Regular Search");
        for (counter = 0; counter < arraysize; counter++) {
            if (arr[counter] == searchnum) {
                System.out.println("True");
                break;
            }
        }
        if (counter == arraysize) {
            System.out.println("False");

        }
        long regendtime = System.nanoTime()-regstarttime;

//Binary Search
        System.out.println("Binary search");
        long binstarttime = System.nanoTime()-(System.nanoTime()-regendtime);
        Arrays.sort(arr);
        int r = Arrays.binarySearch(arr, searchnum);
        if (r >= 0) {
            System.out.println("True");


        } else {
            System.out.println("False ");
        }
        long binendtime = System.nanoTime()-binstarttime;

        long binarytime = System.nanoTime()-(System.nanoTime()-(binendtime+binstarttime));
        System.out.println("Regular Search time is " + regendtime);
        System.out.println("Binary Search time is "+binarytime);

    }
}
