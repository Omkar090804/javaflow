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
        SCMethod1 x=new SCMethod1();
        System.out.println(x.gcd(35,56));    
    } 
        
