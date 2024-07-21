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

//rectangle class its properties and methods
class rectangle
{
    public double length;
    public double breadth;
    
    public double area()
    {
        return length*breadth;
    }
    
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    
    public boolean isSquare()
    {
        if(length==breadth)
            return true;
        else
            return false;
    }
    
  public static void main(String[] args) {
        rectangle r=new rectangle();
        r.length=10.5;
        r.breadth=5.5;
        
        System.out.println("Area"+r.area());
        System.out.println("perimeter"+r.perimeter());
        System.out.println("Is it a Square"+r.isSquare());
    }
}
