//Inheritance of circle and cylinder
class circle{
    public double  radius;

    public double  area(){
        return 3.14* radius * radius;
    }
     public double  perimeter() {
         return 2 * 3.14* radius;
     }
}

class cylinder extends circle {
    public double height;

    public double volume() {
        return radius * height;
    }

    public static void main(String[] args) {
        cylinder c1=new cylinder();
        c1.height =5;
        c1.radius =5;

     System.out.println(c1.area());
     System.out.println(c1.volume());
    }
}
