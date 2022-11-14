package Main;

public class Circle extends Figure{
    private final double pi = 3.14;
    public Circle(double side){
        super(side);
    }
    @Override
    public double getArea() {
        return (2*pi)*super.getSide()*super.getSide();
    }

    @Override
    public double getPerimeter() {
        return 2*pi*super.getSide();
    }
    @Override
    public double getSide(){
        return super.getSide();
    }
}
