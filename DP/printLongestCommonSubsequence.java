/*
//can also see for printing all the subsequences as here it is just printing one and can also see for printing lexographically

You are given two strings ‘s1’ and ‘s2’.
Return the longest common subsequence of these strings.
If there’s no such string, return an empty string. If there are multiple possible answers, return any such string.

Input: ‘s1’  = “abcab”, ‘s2’ = “cbab”
Output: “bab”
Explanation:
“bab” is one valid longest subsequence present in both strings ‘s1’ , ‘s2’.
*/



class Solution {
    public static String findLCS(int n, int m, String s1, String s2) {
        int[][] dp = new int[n + 1][m + 1];

        // Fill the dp table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        // Reconstruct the LCS string
        int i = n, j = m;
        StringBuilder lcs = new StringBuilder();

        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                lcs.append(s1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        return lcs.reverse().toString();
    }
}
