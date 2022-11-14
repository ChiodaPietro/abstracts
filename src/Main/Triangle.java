package Main;

public class Triangle extends Figure{
    private double height=0;
    public Triangle(double height, double[] sides){
        super(sides);
        this.height=height;
    }
    @Override
    public double getArea() {
        return super.getSides(0)*height;
    }

    @Override
    public double getPerimeter() {
        return super.getSides(0)+super.getSides(1)+super.getSides(2);
    }
    @Override
    public double[] getSides(){
        return super.getSides();
    }
}
