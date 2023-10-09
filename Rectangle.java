package chapter13;

public class Rectangle extends GeometricObject {
    private double height = 1;
    private double length = 1;
    /** Abstract method getArea */
    @Override
    public double getArea() {
        return (length * height);
    }
    /** Abstract method getPerimeter */
    @Override
    public double getPerimeter(){
        return (2 * length + height);

    }
}


