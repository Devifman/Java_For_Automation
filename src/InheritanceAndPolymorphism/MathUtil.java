package InheritanceAndPolymorphism;

public class MathUtil {

    protected int[] arr;
    protected double arrDouble;
    protected int integer;

    protected MathUtil(int[] arr) {
        this.arr = arr;

    }

    protected MathUtil(int[] arr, int integer) {

    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public double getArrDouble() {
        return arrDouble;
    }

    public void setArrDouble(double arrDouble) {
        this.arrDouble = arrDouble;
    }

    public int getInteger() {
        return integer;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }

    public int minimum(int array[]) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public int maximum(int array[]) {
        int max = arr[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int nexAfter(int array[], int number) {
        int nexto = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > integer) {
                nexto = array[i];
            }
            break;
        }
        return nexto;
    }

    public int pow(int x, int y) {
        int raise = 1;
        for (int i = 1; i <= y; i++) {
            raise *= x;
        }
        return raise;
    }

    public double mindouble(double array[]) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        return min;
    }
    public double maxdouble(double array[]){
        double max = array[0];
        for (int i = 0;i<array.length;i++){
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
    public double nextAfter(double array[], double number){
        double nexto = 0;
        for (int i=0;i<array.length;i++) {
            if (array[i]>number){
                nexto = array[i];
                break;
        }

        }

        return nexto;
    }
    public static double pow(double x, int y){
        double raise= 1;
        for (int i= 1;i<y;i++){
            raise*=x;
        }
        return raise;
    }

}