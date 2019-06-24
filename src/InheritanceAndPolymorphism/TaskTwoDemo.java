package InheritanceAndPolymorphism;

public class TaskTwoDemo {
    public static void main(String[] args) {
        CircleTwo circle = new CircleTwo();
        Square square = new Square();
        Regtangle regtangle = new Regtangle();
        Shapes[] figures = new Shapes[]{square, circle, regtangle};
        for (Shapes n : figures) {
            System.out.print("[" + n.toString() + "]" + ","+"\n");
            System.out.println(regtangle.getPerimeter());

        }

    }
}
