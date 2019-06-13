import java.lang.reflect.Array;
public class Sorting {
    public static void main (String[] args) {
        int arr[] = {4,5,2,1,3};
        System.out.println("Unsorted Array");
        for (Integer n:arr){
            System.out.print("["+ n + "]" + ",");
        }
        for (int i = 0;i<arr.length;i++){
            int num = arr[i];
            for (int j = i-1; j>=0; j--){
                int leftnum =arr[j];
                if (num<leftnum){
                    arr[j+1]= leftnum;
                    arr[j]= num;
                }
                else {
                    break;
                }
            }
        }
        System.out.println();
        System.out.println("Bubble sorted array");
        for (Integer n:arr){
            System.out.print("["+ n + "]" + ",");
        }
        System.out.println();
        System.out.println("Selected Sort");
        int Index = 0;
        int min = 0;
        for (int i= 0; i<arr.length;i++){
            min = arr[i];
            Index = i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<min){
                    Index = j;
                    min=arr[j];

                }


            }
            if (arr[i]!= arr[Index]) {
                arr[Index] = arr[i];
            }
            arr[Index] = arr[i];
            arr[i] = min;
        }
        for (Integer n:arr){
            System.out.print("["+ n + "]" + ",");
        }

    }
}

