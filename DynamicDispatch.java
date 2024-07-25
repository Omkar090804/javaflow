//The class whose object is created ,its method will only be called
class Super
{
    public void meth1()
    {
        System.out.println("Super Meth1");
    }

    public void meth2()
    {
        System.out.println("Super Meth2");
    }
}

class Sub extends Super
{
    @Override
    public void meth2()
    {
        System.err.println("Sub Meth2");
    }

    public void meth3()
    {
        System.out.println("Sub Meth3");
    }
}

public class DynamicDispatch
{
    public static void main(String[] args)
    {
        Super sup=new Sub();

        sup.meth1();
        sup.meth2();


    }
}

//example 2

class Car
{
    public void start(){
        System.out.println("Car Started");
    }
    public void accelerate(){
        System.out.println("Car is Accelerated");
    }
    public void changeGear(){
        System.out.println("Car Gear Changed");
    }
    
}

class LuxaryCar extends Car
{
    public void changeGear(){
        System.out.println("Automatic Gear");
    }
    public void openRoof(){
        System.out.println("Sun Roof is Opened");
    }

    
    public static void main(String[] args) 
    {
        Car c=new LuxaryCar();
        c.start();
        c.accelerate();
        c.changeGear();
      
    }
    
}

