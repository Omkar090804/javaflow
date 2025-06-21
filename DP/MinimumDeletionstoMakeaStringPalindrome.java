/*
Given a string s, write a program to delete the minimum number of characters from the string so that the resultant string is a palindrome, while maintaining the order of characters.

Examples:

Input: s = "aebcbda"
Output: 2
Explanation: Remove characters 'e' and 'd'.
*/

class Solution {
    public int minDeletions(String s) {
        int n = s.length();
        
        String rev = "";                          //longest common palindrome is lcs of s and reverse of s like ex agbdba is s and s reverse is abdbga there lcs is abdba which is the longest common palindrome
        for (int i = n - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        int[][] dp = new int[n + 1][n + 1];

        // LCS logic: compare original and reversed string
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == rev.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        int palindromelength= dp[n][n];
        int deletions = n - palindromelength;
        return deletions;
       
    }
}
