package Exceptions;

public class FinalyExc {
    public static void main(String[] args) {
        try {
            Exception problem = new Exception("This is Impossible");
            throw problem;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Right here");
        }
    }
}
