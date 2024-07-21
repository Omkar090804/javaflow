//complete code with property methods (getter,setter) ,different types of constructors,main method and pvsm

public class cylinder {
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public void setRadius(int r) {
        radius = r;
    }

    public void setHeight(int h) {
        height = h;
    }

    public cylinder() {
        radius = 1;
        height = 1;
    }

    public cylinder(int r, int h) {
        radius = r;
        height = h;
    }

    int area() {
        return radius * height;
    }

    public static void main(String[] args) {
        cylinder obj = new cylinder(10, 5);
        System.out.println(obj.area());
    }
}
