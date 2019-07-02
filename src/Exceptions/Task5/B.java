package Exceptions.Task5;

public class B extends A {
    public B(String text) {
        super(text);
    }

    public static A AThrow(String check) throws A {
        return new A(check);
    }

    @Override
    public String getText() {
        return super.getText();
    }
}
