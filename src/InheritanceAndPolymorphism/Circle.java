package InheritanceAndPolymorphism;

public class Circle {
    public double radius;
     public String color;
   public Circle(){
       radius = 0.0;
       color = "Red";

    }
    public Circle(double radius, String color){
        this.color = color;
        this.radius = radius;
    }

    public double getRaduis() {
        return radius;
    }

    public void setRaduis(double raduis) {
        this.radius = raduis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString (){
        final String result = "Color of Circle is:" + color + '\n' + "Radius of Circle is " + radius;
        return result;
    }

    public double getArea(){
       final double area = Math.PI*(radius*radius);
       return area;
    }


}

