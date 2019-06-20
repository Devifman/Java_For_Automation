package InheritanceAndPolymorphism;

public class CircleTwo extends Shapes {
    double radius;
    public CircleTwo(){
        radius = 1.0;
    }
    public CircleTwo(double radius){
        this.radius = radius;
    }
    public CircleTwo(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        final  double area = Math.PI*(radius*radius);
        return area;
    }
    @Override
    public String toString(){
        String statement;
        if (filled = true){
            statement = "filled";
        }
        else {
            statement = "not filled";
        }
        return   "A Circle  with a radius = "+radius+" which is a subclass of "+ super.getClass().getSimpleName()+" where "+ super.getClass().getSimpleName()+" is output of the toString() method from the superclass";


    }
}
