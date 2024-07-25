abstract class Super
{
    public Super() { 
        System.out.println("Super Constructor");
    }

    public void meth1()
    {
        System.out.println("Meth1 of Super");
    }

    abstract public void meth2();
}

class Sub extends Super
{
    @Override
    public void meth2()
    {
        System.out.println("Sub meth2"); //here the method meth2 is overriden and is declared in the child class so that child class becomes 
                                        // concrete class
    }
}
public class Abstractclasses
{
    public static void main(String[] args)
    {
        Super s=new Sub(); //dynamic method dispatch
        s.meth1();
        s.meth2();
    }
}
