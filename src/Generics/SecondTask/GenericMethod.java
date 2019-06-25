package Generics.SecondTask;

public class GenericMethod {
    public static <T extends Comparable> boolean compareTo(T comp1, T comp2) {
        if (comp1 == null || comp2 == null)
            return false;

        if (comp1.getClass() != comp2.getClass())
            return false;
        return comp1.compareTo(comp2) == 0;
    }

}

