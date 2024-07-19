// Prime or not using method
public class Methods {
    static boolean prime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println("NUMBER IS NOT PRIME");
                return false;
            }
        }
        System.out.println("NUMBER IS PRIME");
        return true;
    }


        public static void main (String[]args){
            prime(10);

        }

    }


//GCD of two numbers
public class Methods{
     int gcd(int m,int n) {
        while(m!=n){
            if
              (m>n)m=m-n;
            else 
              n=n-m;
        }
        return m;
    }


  public static void main(String[] args)  {
        Methods x=new Methods();
        System.out.println(x.gcd(35,56));    
    } 


    //Method overloading
class Test
{
    public int max(int a,int b)
    {
        return a>b?a:b;
    }
     public int max(int a,int b,int c)
    {
        if(a>b && a>c) return a;
        else if(b>c) return b;
        return c;
    }
}
    
public class Overloading 
{
    public static void main(String[] args) 
    {
        Test t=new Test();
        t.max(10,5);
        t.max(10,15,5);      
    }
    
}

