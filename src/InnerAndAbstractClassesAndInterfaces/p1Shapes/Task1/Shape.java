package InnerAndAbstractClassesAndInterfaces.p1Shapes.Task1;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape() {
        filled = true;
        color = "Green";
        double radius;
    }
    public Shape(String color,boolean filled,double radius){
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
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract boolean isInside(double x, double y);

}