     *     
    ***    
   *****    
  *******  
 ********* 

 ssss*ssss      //s is the number of spaces        
 sss***sss    
 ss*****ss   
 s*******s 
 ********* 

import java.util.Scanner;

class Patterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (n):");
        int n = scanner.nextInt();
        for (int i = 1; i < n; i++) {    //Outer loop

            for (int j = 1; j <= n - i; j++) {     //loop for spaces 
                System.out.print(" ");
            }
                for (int k = 1; k <= 2*i - 1 ; k++){           //loop for printing stars
                    System.out.print("*");
                }
                for (int j = 1; j <= n - i; j++) {           //loop for spaces 
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }



*
**
***
****
*****
****
***
**
*


    import java.util.Scanner;

class Patterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (n):");
        int n = scanner.nextInt();
        for (int i = 1; i < n; i++) {
                for (int j = 1; j <= i ; j++){
                    System.out.print("*");
                }

                System.out.println();
            }
        for (int i = n; i >0 ; i--) {
            for (int j = 1; j <= i ; j++){
                System.out.print("*");
            }

            System.out.println();
        }
        }
    }




1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 


import java.util.Scanner;

class Patterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();
        int start;

        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {              //even row staring from 0 
                start = 0;
            } else {
                start = 1;                 //odd row starting from 1
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;              //change 0 to 1 and vice versa
            }

            System.out.println();
        }
    }
}




1      1
12    21
123  321
12344321


    import java.util.Scanner;

class Patterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {        //printing numbers
                System.out.print(j);
            }

            for (int k = 1; k <= 2 * (n - i); k++) {      // Middle spaces
                System.out.print(" ");
            }


            for (int j = i; j >= 1; j--) {        //printing numbers
                System.out.print(j);
            }

            System.out.println();
        }

    }
}




1
23
456
78910

    import java.util.Scanner;

class Patterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();
        int start=1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(start);
                start++;

            }

            System.out.println();
        }

    }
}
