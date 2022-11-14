package Main;

public class Hexagon extends Figure{
    public Hexagon(double side){
        super(side);
    }

    @Override
    public double getArea() {
        return (3*1.732)/2*(super.getSide()*super.getSide());
    }

    @Override
    public double getPerimeter() {
        return super.getSide()*6;
    }
}
