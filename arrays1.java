 //Inserting an Element

public class Array
{
    public static void main(String[] args) 
    {
        int A[]=new int[10];
        A[0]=3;A[1]=9;A[2]=7;A[3]=8;A[4]=12;A[5]=6;
        
        int n=6;
        
        for(int i=0;i<n;i++)
            System.out.print(A[i]+",");
        System.out.println("");
     
        int x=20;
        int index=2;
        
        for(int i=n;i>index;i--)
            A[i]=A[i-1];
        A[index]=x;
        
        for(int i=0;i<n;i++)
            System.out.print(A[i]+",");
        System.out.println("");
     
        
        
        
        
        
        
    }
    
    
   /* Left Rotation
    public static void main(String[] args) 
    {
        int A[]={3,9,7,8,12,6,15,5,4,10};
        
        for(int x:A)
            System.out.print(x+",");
        System.out.println("");
        
        int temp=A[0];
        
        for(int i=1;i<A.length;i++)
        {
            A[i-1]=A[i];
        }
        A[A.length-1]=temp;
        
        for(int x:A)
            System.out.print(x+",");
        System.out.println("");

    }   */


/* Copying an array
    public class array1 {
        public static void main(String[] args) {


            int A[] = new int[6];
            A[0] = 3;
            A[1] = 9;
            A[2] = 7;
            A[3] = 8;
            A[4] = 12;
            A[5] = 6;
            int B[] = new int[6];

            for (int i = 0; i < A.length; i++)
                System.out.print(A[i] + ",");
            System.out.println("");

            for (int i = 0; i > A.length; i++) {
                A[i] = B[i];
            }
            for (int i = 0; i < A.length; i++)
                System.out.print(A[i] + ",");
            System.out.println("This is the B array");


        }
    }
   
 */


 
/* Reversing and copying array into another
    public class array1 {
        public static void main(String[] args) {
            int A[] = {3, 9, 7, 8, 12, 6};
            int B[] = new int[6];


            for (int i = 0; i < A.length; i++) {
                System.out.print(A[i] + ",");
            }
            System.out.println("");


            for (int i = 0; i < A.length; i++) {
                B[i] = A[A.length - 1 - i];
            }


            for (int i = 0; i < B.length; i++) {
                System.out.print(B[i] + ",");
            }
            System.out.println("This is the reversed array ");
        }
    }

*/
