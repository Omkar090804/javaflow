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


      //student class
class Student {
    public int roll;
    public String name;
    public String course;
    public int m1, m2, m3;

    public int total() {
        return m1 + m2 + m3;
    }

    public float average() {
        return (float) total() / 3;
    }

    public char grade() {
        if (average() >= 60)
            return 'A';
        else
            return 'B';
    }

    public String toString() {
        return "Roll No:" + roll + "\n" + "Name:" + name + "\n" + "Course:" + course + "\n";
    }

    public static void main(String[] args) {
        Student s = new Student();

        s.roll = 1;
        s.name = "OMKAR";
        s.course = "CS";
        s.m1 = 70;
        s.m2 = 80;
        s.m3 = 65;

        System.out.println("Total :" + s.total());
        System.out.println("Average :" + s.average());

        System.out.println("Details:\n " + s);  //tostring method so directly can be called by object s 

    }

}
