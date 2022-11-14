package Main;

public class Main {
    public static void main(String[] args) {
        Trapezio t=new Trapezio(new double[] {4,3,2,1});
        Circle c=new Circle(10);
        Triangle triangle= new Triangle(10, new double[] {3,7,2});
        Hexagon h = new Hexagon(10);
        System.out.println(t.getSides()+" ; "+t.getArea()+" ; "+t.getPerimeter()+" ; \n" +
                " "+c.getSide()+" ; "+c.getArea()+" ; "+c.getPerimeter()+"\n" +
                " "+triangle.getSides()+" ; "+triangle.getArea()+" ; "+triangle.getPerimeter()+"\n" +
                " "+h.getSide()+" ; "+h.getArea()+" ; "+h.getPerimeter());
    }
}
