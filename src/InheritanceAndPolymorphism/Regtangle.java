package InheritanceAndPolymorphism;

public class Regtangle extends Shapes {
    double width;
    double length;
    public Regtangle(){
        width = 1.0;
        length = 1.0;
    }
    public Regtangle(double width, double length){
        this.length =length;
        this.width = width;

    }
    public  Regtangle(double width, double length, String color, boolean filled){
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

    public String toString(){
        return  "A Rectangle with width "+width+" and length "+length+" wich is a subclass of"+ super.getClass().getSimpleName()+"where"+ super.getClass().getSimpleName()+"is output of the toString() method from the superclass";

    }

}
