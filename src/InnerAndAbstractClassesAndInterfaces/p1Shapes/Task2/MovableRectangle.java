package InnerAndAbstractClassesAndInterfaces.p1Shapes.Task2;

public class MovableRectangle implements Movable {
    private MovePoint topLeft;
    private MovePoint bottomRight;

    public MovableRectangle(MovePoint topLeft, MovePoint bottomRight){
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }
    @Override
    public void moveUp(){
        topLeft.moveUp();
        bottomRight.moveUp();
    }
    @Override
    public void moveDown(){
        topLeft.moveDown();
        bottomRight.moveDown();
    }
    @Override
    public void moveRight(){
        topLeft.moveRight();
        bottomRight.moveRight();
    }
    @Override
    public void moveLeft(){
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    public MovePoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MovePoint topLeft) {
        this.topLeft = topLeft;
    }

    public MovePoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MovePoint bottomRight) {
        this.bottomRight = bottomRight;
    }
    @Override
    public String toString(){
        return "TopLeft is here: "+this.topLeft.toString()+"\n"+ "BottomRight is here: "+ this.bottomRight.toString();
    }
    public int getSpeed(){
        return this.topLeft.getxSpeed();
    }
}
