package InnerAndAbstractClassesAndInterfaces.p1Shapes.Task2;

import java.util.Random;

public class MovableDemo {
    public static void main (String[]args){
        int xTop = -5;
        int yTop = 5;

        int xBottom = -5;
        int yBottom = 5;

        int speed = 5;
        MovableRectangle rectangle = new MovableRectangle(new MovePoint(xTop,yTop,speed),new MovePoint(xBottom,yBottom,speed));
        Random randompoint = new Random();
        System.out.println("Start point here: \n"+rectangle.toString()+ "\n with a speed "+rectangle.getSpeed());
        System.out.println();
        for (int i = 0; i<10;i++){
            int point = Math.max(1,randompoint.nextInt(5));
            if (point==1){
                rectangle.moveUp();
                System.out.println("Its go up");
            }
            if (point==2){
                rectangle.moveDown();
                System.out.println("Ist go down");

            }
            if (point==3){
                rectangle.moveLeft();
                System.out.println("It's go left");

            }
            if (point==4){
                rectangle.moveRight();
                System.out.println("It's go right");

            }
            System.out.println(rectangle);
            System.out.println();
        }
    }
}
