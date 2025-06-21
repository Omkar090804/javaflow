/*
Given two strings s1 and s2. The task is to remove or insert the minimum number of characters from/in s1 to transform it into s2. It could be possible that the same character needs to be removed from one point of s1 and inserted into another point.

Examples :

Input: s1 = "heap", s2 = "pea"
Output: 3
Explanation: 'p' and 'h' deleted from heap. Then, 'p' is inserted at the beginning.
*/

class Solution {
    public int minOperations(String s1, String s2) {
        
        int n=s1.length();
        int m=s2.length();
        
        int t[][] = new int[n+1][m+1];
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                }
                else{
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        
        int lcs=t[n][m];                                 //here lcs is ea
        int deletions=n-lcs;                            //so heap - ea (4-2) so total deletions is 2
        int insertions=m-lcs;                           // and pea - ea (3-2) so total insertions is 1
       
        return  deletions + insertions;                  // output = 3 ;
    }
}
