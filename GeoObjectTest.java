package chapter13;
public class GeoObjectTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.printCircle();
        System.out.println(circle.toString());
        GeometricObject geoObj;
        geoObj = new Circle();
        //GeometricObject geoObj2 = new GeometricObject();
        Rectangle rectangle = new Rectangle();
        GeometricObject geoObj3 = new Rectangle();
        System.out.println (rectangle.toString());

    }
}
