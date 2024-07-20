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


    //Method overloading for reversing an integer and an array
    public class Methods{
    int reverse(int n)
    {
        int rev=0;
        
        while(n>0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }
    
    
    int [] reverse(int A[])
    {
        int B[]=new int[A.length];
        
        for(int i=A.length-1,j=0;i>=0;i--,j++)
            B[j]=A[i];
        
        return B;
    }
    
    public static void main(String[] args) 
    {
        //create an obj and call or call directly using static keyword
    } 


        //Validating a string and age
        public class Methods{
    static boolean validate(String name){
        return name.matches("[a-zA-Z\\s]");
    }
    static boolean validate(int age)
    {
        return age>=3 && age<=15;
    }

    public static void main(String[] args){
        boolean validation=validate(17);
        System.out.println(validation);

    }
}
    
    
