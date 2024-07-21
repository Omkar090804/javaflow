//circle class,properties and methods

public class Circles{
    public double r;

    static double area(double r) {
        return 3.14 * r * r;
    }

    static double perimeter(double r) {
        return 2 * 3.14 * r;
    }

    public static void main(String[] args) {
        double radiusForArea = 7;
        double radiusForPerimeter = 7;

        double areaOfCircle = area(radiusForArea);
        double perimeterOfCircle = perimeter(radiusForPerimeter);

        System.out.println(areaOfCircle);
        System.out.println(perimeterOfCircle);
    }
}
