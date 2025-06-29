/*
You are given n identical eggs and you have access to a k-floored building from 1 to k.

There exists a floor f where 0 <= f <= k such that any egg dropped from a floor higher than f will break, and any egg dropped from or below floor f will not break.
There are few rules given below. 

An egg that survives a fall can be used again.
A broken egg must be discarded.
The effect of a fall is the same for all eggs.
If the egg doesn't break at a certain floor, it will not break at any floor below.
If the egg breaks on a certain floor, it will break on any floor above.
Return the minimum number of moves you need to determine the value of f with certainty.

Examples:

Input: n = 2, k = 36
Output: 8
Explanation: In all the situations, 8 maximum moves are required to find the maximum floor. Following is the strategy to do so:
Drop from floor 8 → If breaks, check 1-7 sequentially.
Drop from floor 15 → If breaks, check 9-14.
Drop from floor 21  → If breaks, check 16-20.
Drop from floor 26 → If breaks, check 22-25.
Drop from floor 30 → If breaks, check 27-29.
Drop from floor 33 → If breaks, check 31-32.
Drop from floor 35 → If breaks, check 34.
Drop from floor 36 → Final check.
*/


class Solution {
    static int eggDrop(int n, int k) {
     
        // with i eggs and j floors
        int[][] dp = new int[n + 1][k + 1];

        // If we have 0 floors => 0 trials needed
        // If we have 1 floor => 1 trial needed
        for (int i = 1; i <= n; i++) {
            dp[i][0] = 0;
            dp[i][1] = 1;
        }

        for (int j = 1; j <= k; j++) {
            dp[1][j] = j;
        }

        for (int eggs = 2; eggs <= n; eggs++) {
            for (int floors = 2; floors <= k; floors++) {

                int low = 1, high = floors;
                int minAttempts = Integer.MAX_VALUE;

                while (low <= high) {
                    int mid = (low + high) / 2;

                    // If egg breaks: check floors below (eggs - 1, mid - 1)
                    int breaks = dp[eggs - 1][mid - 1];

                    // If egg doesn't break: check floors above (eggs, floors - mid)
                    int survives = dp[eggs][floors - mid];

                    // Max of both scenarios + 1 for current drop
                    int tempAttempts = 1 + Math.max(breaks, survives);

                    // We want the minimal number among the worst cases
                    minAttempts = Math.min(minAttempts, tempAttempts);

                    // Narrow down search space:
                    if (breaks > survives) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
                // Store result for (eggs, floors)
                dp[eggs][floors] = minAttempts;
            }
        }
        return dp[n][k];
    }
}
