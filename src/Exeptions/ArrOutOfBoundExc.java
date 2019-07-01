package Exeptions;

public class ArrOutOfBoundExc {
    public static void main(String[] args){
        int []arr = new int[10];
        try
        {
            for (int i=0; i<=arr.length;i++){
                System.out.println(arr[i]);

            }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Impossible - out of bounds of array");
        }
    }
}
