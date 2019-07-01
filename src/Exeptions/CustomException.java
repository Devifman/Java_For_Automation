package Exeptions;

public class CustomException extends Exception {
    private String text;
    public CustomException(String exception){
        this.text=exception;
    }
    public String getText(){
        return this.text;
    }
    public static void main(String[] args){
        CustomException someException = new CustomException("Here some exception");
        System.out.println(someException.getText());
        try {
            throw someException;
        }catch (CustomException e){
            System.out.println("We Catch " +someException.getText() );
        }

    }
}
