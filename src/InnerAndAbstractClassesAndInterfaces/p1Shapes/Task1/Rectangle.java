package InnerAndAbstractClassesAndInterfaces.p1Shapes.Task1;

public class Rectangle extends Shape {
    double width;
    double length;
    public Rectangle(){
        width = 1.0;
        length = 1.0;
    }
    public Rectangle(double width, double length){
        this.length =length;
        this.width = width;

    }
    public  Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPerimeter(){
        double perimenter = width+length;
        return perimenter;
    }
    @Override
    public double getArea(){
        return width*length;
    }

    @Override
    public boolean isInside(double x, double y){
        return this.length/2.0>=Math.abs(y) && this.width/2.0>= Math.abs(x);
    }

    public String toString(){
        return  "A Rectangle with width "+width+" and length "+length+" wich is a subclass of"+ super.getClass().getSimpleName()+"where"+ super.getClass().getSimpleName()+"is output of the toString() method from the superclass";

    }

}

