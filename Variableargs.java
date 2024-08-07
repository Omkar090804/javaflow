//max value
public class Methods {
    static int max(int ...A)
    {
        if(A.length==0)return Integer.MIN_VALUE;
        int max=A[0];
        for(int i=1;i<A.length;i++)
            if(A[i]>max)max=A[i];
        
        return max;
    }
     public static void main(String[] args) 
    {
        System.out.println(max());
        System.out.println(max(10));
        System.out.println(max(10,20));
        System.out.println(max(10,20,30));

    }    

//sum of elements
 static int sum(int ...A)
    {
        int s=0;
        for(int i=0;i<A.length;i++)
            s+=A[i];
        
        return s;
    }
    
    static double sum(double ...P)
    {
        double sum=0;
        
        for(int i=0;i<P.length;i++)
            sum+=P[i];
    }
 public static void main(String[] args) 
    {
        System.out.println(max());
        System.out.println(max(10));
        System.out.println(max(10,20));
        System.out.println(max(10,20,30));

    }    

  
  
