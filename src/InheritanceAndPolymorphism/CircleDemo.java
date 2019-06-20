package InheritanceAndPolymorphism;

public class CircleDemo {
    public static void main(String[] args){
        Circle MyCircle = new Circle(8.4,"Blue");
        System.out.println(MyCircle.toString());
        System.out.println("Area of the cirle is: "+MyCircle.getArea());
        Cylinder MyCylinder = new Cylinder(12.4,5);
        System.out.println(MyCylinder.toString());
        System.out.println("Area of the Cylinder is: "+MyCylinder.getArea());
        System.out.println("Volume of the Cylinder is :"+MyCylinder.getVolume());

    }

}
