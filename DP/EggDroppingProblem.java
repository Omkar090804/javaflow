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
