/*
You are given two strings s1 and s2. Your task is to find the length of the longest common substring among the given strings.

Examples:

Input: s1 = "ABCDGH", s2 = "ACDGHR"
Output: 4
Explanation: The longest common substring is "CDGH" with a length of 4.
*/

class Solution {
    public int longestCommonSubstr(String s1, String s2) {
       int n = s1.length();
       int m=  s2.length();
        int maxLen = 0;

        int t[][]= new int[n+1][m+1];
        
        for(int i=0;i<=n;i++){
            t[i][0]=0;
        }
        for(int j=0;j<=m;j++){
            t[0][j]=0;
        }
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1))
            {
                    t[i][j]=1+t[i-1][j-1];
                     maxLen = Math.max(maxLen, t[i][j]); 
                }
                else{
                    t[i][j]= 0;
                }
            }
        }
        return maxLen;
        }
    }
