 //Use choice tree(recursion)

class Knapsack {
    public int knapsack(int wt[], int val[], int w, int n) {

        if (n == 0 || w == 0) {                      //Base condn
            return 0;
        }

        if (wt[n - 1] > w) {                           //weight of element greater than knapsack capacity
            return knapsack(wt, val, w, n - 1);

        } else {                                                                                  
            return Math.max(val[n - 1] + knapsack(wt, val, w - wt[n - 1], n - 1),
                    knapsack(wt, val, w, n - 1));
        }
    }

    public static void main(String[] args) {
        int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int w = 50;
        int n = val.length;
        Knapsack ks = new Knapsack();
        System.out.println("Maximum value: " + ks.knapsack(wt, val, w, n));
    }
}


//Adding memoization to recursion code

import java.util.Arrays;

public class Knapsack{
    static int[][] t;                         //creating a table t, here only two[][] beacuse only the weight of knapsack and the number of elemments change in recusrion code 

    public static int knapsack(int[] wt, int[] val, int W, int n) {

        if (n == 0 || W == 0) {
            return 0;
        }

        if (t[n][W] != -1) {                       //checking if required soecific position is not equal to -1 if not then return it
            return t[n][W];
        }

        if (wt[n - 1] <= W) {
            t[n][W] = Math.max(val[n - 1] + knapsack(wt, val, W - wt[n - 1], n - 1), knapsack(wt, val, W, n - 1));

        }
        else {
            t[n][W] = knapsack(wt, val, W, n - 1);
        }

        return t[n][W];
    }

    public static void main(String[] args) {
        int n = 4;
        int W = 8;
        int[] wt = {1, 3, 4, 5};
        int[] val = {10, 40, 50, 70};

        t = new int[n + 1][W + 1];              //to keep all values of table as -1 at start
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }

        int maxProfit = knapsack(wt, val, W, n);
        System.out.println("Maximum Profit: " + maxProfit);
    }
}


// Top-Down                                                                        //The DP table t[n+1][w+1] is structured as :

                                                                                   //  Rows (i) = Items (0 to n) 

                                                                                   //  Columns (j) = Weights (0 to w)

 public class Knapsack {
    public static int knapSack(int w, int wt[], int val[], int n) {
        int[][] t = new int[n+1][w+1];
        
        // Initialize matrix
        for(int i = 0; i < w+1; i++) t[0][i] = 0;
        for(int j = 0; j < n+1; j++) t[j][0] = 0;
        
        // Choice Diagram to code
        for(int i = 1; i < n+1; i++) {
            for(int j = 1; j < w+1; j++) {
             
                if(wt[i-1] <= j) {
                    t[i][j] = Math.max(val[i-1] + t[i-1][j-wt[i-1]], t[i-1][j]);
                }
              
                else {
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][w];
    }

    public static void main(String[] args) {
        int val[] = new int[] {60, 100, 120};
        int wt[] = new int[] {10, 20, 30};
        int W = 50;
        int n = val.length;
        System.out.println(knapSack(W, wt, val, n));
    }
}










