
class Test
{
    static int x=10;     //static var
    int y=20;
    
    void show()
    {
        System.out.println(x+" "+y);
    }
    
    static void display()  {        //static method()  
        System.out.println(x);
    }

    public static void main(String[] args) {           //static members and methods can be directly called using class name without the use of objects
                                                       //classname.mem;
                                                       //classname.method()
        
        Test t1=new Test();
        t1.show();
        t1.x=30;
        t1.y=50; 
        
        Test t2=new Test();
        t2.show();







      
        
    }
    
}
