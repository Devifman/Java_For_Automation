package InnerAndAbstractClassesAndInterfaces.p1Shapes.Task2;

public class MovePoint implements Movable {
    private int x;
    private int y;
    private  int xSpeed;
    private int ySpeed;

    public MovePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovePoint(int x, int y, int speed){
        this.x=x;
        this.y = y;
        this.xSpeed = speed;
        this.ySpeed = speed;
    }
    public MovePoint(){

    }
    public void moveUp(){
        this.y+=this.ySpeed;
    }
    public void moveDown(){
        this.y-=this.ySpeed;
    }
    public void moveRight(){
        this.x+=this.xSpeed;
    }
    public void moveLeft(){
        this.x-=this.xSpeed;
    }
    public String toString(){
        return "Our point on sector "+x+","+y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }
}
