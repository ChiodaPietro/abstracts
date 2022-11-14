package Main;

public class Trapezio extends Figure {

    public Trapezio(double[] sides){
        super(sides);
    }
    @Override
    public double[] getSides(){
        return super.getSides();
    }
    @Override
    public double getSides(int pos){
        return super.getSides(pos);
    }
    @Override
    public void setSides(double[] sides){
        super.setSides(sides);
    }
    @Override
    public void setSides(double side, int pos){
        super.setSides(side,pos);
    }
    @Override
    public double getArea(){
        return getSides(0)*getSides(1);
    }
    @Override
    public double getPerimeter(){
        return getSides(0)+getSides(1)+getSides(2)+getSides(3);
    }
}
