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




