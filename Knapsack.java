//Use choice tree(recursion)

class Knapsack {
    public int knapsack(int wt[], int val[], int w, int n) {

        if (n == 0 || w == 0) {                      //Base
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
