/*
Given two strings s1 and s2, return the length of their longest common subsequence (LCS). If there is no common subsequence, return 0.

A subsequence is a sequence that can be derived from the given string by deleting some or no elements without changing the order of the remaining elements. For example, "ABE" is a subsequence of "ABCDE".

Examples:

Input: s1 = "ABCDGH", s2 = "AEDFHR"
Output: 3
Explanation: The longest common subsequence of "ABCDGH" and "AEDFHR" is "ADH", which has a length of 3.
Input: s1 = "ABC", s2 = "AC"
Output: 2
Explanation: The longest common subsequence of "ABC" and "AC" is "AC", which has a length of 2.
*/

class Solution {
    static int lcs(String s1, String s2) {
      
      int n=s1.length();
      int m=s2.length();
        
        int t[][] = new int[n+1][m+1];
        
        for(int i=0;i<=n;i++){
            t[i][0]=0;
        }
        for(int j=0;j<=m;j++){
            t[0][j]=0;
        }
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    t[i][j]=1+ t[i-1][j-1];
                }
                else{
                  t[i][j]=Math.max(t[i][j-1] , t[i-1][j]);
                
            }
        }
    }
    return t[n][m];
}
}
