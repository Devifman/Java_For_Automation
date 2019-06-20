package InheritanceAndPolymorphism;

public class Cylinder extends Circle {
    double height;
    protected Cylinder(){
        radius = 0.0;
        color ="Red";
    }
    protected Cylinder(double radius,double height, String color){
        this.radius = radius;
        this.height = height;
        this.color = color;
    }
    protected  Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }
     public double getArea(){
         double base = height+radius;
         double cylarea = 2*Math.PI*radius*base;
         return cylarea;
     }
     public double getVolume(){
         return getArea()*height;
     }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public String toString(String color, double radius,double height){
       final String result = "Color of Cylinder is: "+ color +"\n"+"Radius of Cylinder is: "+radius +"\n" + "Height";
       return result;
    }
}

