//Unbounded Knapsack Problem
/* 
Given a rod of length n inches and an array price[], where price[i] denotes the value of a piece of length i. Your task is to determine the maximum value obtainable by cutting up the rod and selling the pieces.

Example:
Input: price[] = [1, 5, 8, 9, 10, 17, 17, 20]
Output: 22
Explanation: The maximum obtainable value is 22 by cutting in two pieces of lengths 2 and 6, i.e., 5 + 17 = 22.
*/

class Solution {
    public int cutRod(int[] price) {
       int n=price.length;
       
        int[] length = new int[n];
        for (int i = 0; i < n; i++) {
            length[i] = i + 1;
        }
        
        int t[][]= new int[n+1][n+1];
       
       
       for(int i=0;i<=n;i++){
           t[0][i]=0;
       }
         for(int j=0;j<=n;j++){
           t[j][0]=0;
       }
       
       for(int i=1;i<n+1;i++){
           for(int j=1;j<n+1;j++){
               if(length[i-1] <= j){
                   t[i][j]=Math.max(price[i - 1]+ t[i][j-length[i-1]] , t[i-1][j]);      //unbounded knapsack problem so t[i] is used instead of t[i-1] as one item can be repeated multiple time here
               }
               else{
                   t[i][j]= t[i-1][j];
               }
           }
       }
        return t[n][n];
    }
}
