//nested inner classes

class Outer
{
  int x=10;
  class Inner
    {
        int y=20;
        public void innerDisplay()
        {
            System.out.println(x+" "+y);
        }
    }
    
    public void outerDisplay()
    {
        inner i=new inner();
        i.innerDisplay();
        System.out.println(i.y);
        
    }

   public static void main(String[] args) 
    {
       Outer o=new Outer();
       o.outerDisplay();       // this will call outer class which will then call the inner class
                              //  if we want to access the inner class directly then 
                             //   Outer.Inner oi=new Outer().new Inner();
                            //    oi.innerDisplay();
  
    }
    
}
