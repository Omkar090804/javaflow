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













