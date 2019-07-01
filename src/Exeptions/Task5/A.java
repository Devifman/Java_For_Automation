package Exeptions.Task5;

public class A extends Throwable {
    private String text;
    public A(String text){
        this.text = text;
    }
    public static A AThrow (String check) throws A{
        return new A(check);
    }

    public String getText(){
        return this.text;
    }
}
