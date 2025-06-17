/*Given an integer array coins[ ] representing different denominations of currency and an integer sum, find the number of ways you can make sum by using different combinations from coins[ ]. 
Note: Assume that you have an infinite supply of each type of coin. Therefore, you can use any coin as many times as you want.
Answers are guaranteed to fit into a 32-bit integer. 

Examples:

Input: coins[] = [1, 2, 3], sum = 4
Output: 4
Explanation: Four Possible ways are: [1, 1, 1, 1], [1, 1, 2], [2, 2], [1, 3].
*/
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
