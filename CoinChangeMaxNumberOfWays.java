class Solution {
   public int count(int coins[], int sum) {
        int n = coins.length;
        int[][] t = new int[n + 1][sum + 1];

        // Initialization
        for (int i = 0; i <= n; i++) {
            t[i][0] = 1; // There is 1 way to make sum 0 (by choosing no coins)
        }

        // Fill the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (coins[i - 1] <= j) {
                    t[i][j] = t[i - 1][j] + t[i][j - coins[i - 1]];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        return t[n][sum];
    }
}
