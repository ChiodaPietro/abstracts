package Main;

public abstract class Figure {
    /*
    i can have attributes and methods, the methods can be
    "WITH A BODY" or abstract
    AT LEAST AN ABSTRACT METHOD
     */
    private double side;
    private double[] sides;
    public Figure(double[] sides){
        this.sides=sides;
    }
    public Figure(double side){this.side= side;}
    public double getSides(int pos){
        return sides[pos];
    }
    public double getSide(){return side;}
    public double[] getSides(){
        return sides;
    }
    public void setSides(double[] sides){
        this.sides=sides;
    }
    public void setSides(double side, int pos){
        this.sides[pos]=side;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
