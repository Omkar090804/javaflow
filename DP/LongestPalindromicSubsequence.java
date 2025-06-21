/*
Given a string s, return the length of the longest palindromic subsequence.

A subsequence is a sequence that can be derived from the given sequence by deleting some or no elements without changing the order of the remaining elements.

A palindromic sequence is a sequence that reads the same forward and backward.

Examples:Input: s = "abcd"
Output: 1
Explanation: "a", "b", "c" and "d" are palindromic and all have a length 1.
Input: s = "agbdba"
Output: 5
Explanation: The longest palindromic subsequence is "abdba", which has a length of 5. The characters in this subsequence are taken from the original string "agbdba", and they maintain the order of the string while forming a palindrome.
*/

class Solution {
    public int longestPalinSubseq(String s) {
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

        return dp[n][n]; // Length of longest palindromic subsequence
    }
}
