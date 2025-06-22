/*
Given string str, find the length of the longest repeating subsequence such that it can be found twice in the given string.

The two identified subsequences A and B can use the same ith character from string s if and only if that ith character has different indices in A and B. For example, A = "xax" and B = "xax" then the index of the first "x" must be different in the original string for A and B.

Examples :

Input: s = "axxzxy"
Output: 2
*/

class Solution {
    public int LongestRepeatingSubsequence(String s) {
        int n= s.length();
        
        int t[][]=new int[n+1][n+1];
        
        for(int i=1;i<n+1;i++){
             for(int j=1;j<n+1;j++){
                 if( s.charAt(i-1)==s.charAt(j-1) && i!=j){       //printing lcs just that also priting that elements in lcs which are common in both strings but are at different indexs that is why we have put i!=j rest complete code is same
                     t[i][j]= 1 + t[i-1][j-1];
                 }
                 else{
                    t[i][j]=Math.max(t[i][j-1],t[i-1][j]); 
             }
             }
             }
        
        return t[n][n];
    } 
    }

