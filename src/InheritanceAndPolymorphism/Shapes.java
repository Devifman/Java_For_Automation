package InheritanceAndPolymorphism;

public class Shapes {
    String color;
    boolean filled;
    public Shapes() {
        filled = true;
        color = "Green";
    }
    public Shapes(String color,boolean filled){
        this.filled = filled;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(String color, boolean filled){
        String statement;
        if (filled = true){
            statement = "filled";
        }
        else {
            statement = "not filled";
        }
        return  "A Shape with a color of"+ color+" and "+ statement;

    }
}
