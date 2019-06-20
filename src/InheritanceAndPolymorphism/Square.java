package InheritanceAndPolymorphism;

public class Square extends Regtangle {
    public Square(){
       super();
    }
    public Square(double side){
        super(side,side);
    }
    protected Square(double side, boolean filled, String color){
        super(side,side);
        this.color = color;
        this.filled = filled;

    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double side){
        super.width = side;
    }
    public  double getLength(){
        return length;
    }
    public void setLength(double side){
     super.length=  side;
    }
    public String getColor(){
        return color;
    }
    public void setColor(){
        this.color = color;
    }
    public  void  setFilled(){
        this.filled = filled;
    }
    public boolean getFilled(){
        return filled;
    }

    @Override
    public double getPerimeter(){
        return super.getPerimeter();
    }

    @Override
    public  String toString(){
        return "A square with side ="+length +" wich is a superclass of "+super.getClass().getSimpleName();
    }

}
