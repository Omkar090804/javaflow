/*You are given an array coins[], where each element represents a coin of a different denomination, and a target value sum. You have an unlimited supply of each coin type {coins1, coins2, ..., coinsm}.

Your task is to determine the minimum number of coins needed to obtain the target sum. If it is not possible to form the sum using the given coins, return -1.

Examples:

Input: coins[] = [25, 10, 5], sum = 30
Output: 2
Explanation: Minimum 2 coins needed, 25 and 5  
*/

class Solution {
    public int minCoins(int coins[], int sum) {
        int n = coins.length;
        int[][] t = new int[n+1][sum+1];
        
        for(int i = 0; i <= n; i++){
            t[i][0] = 0;
        }
        for(int j = 1; j <= sum; j++){
            t[0][j] = sum + 1;
        }
       
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= sum; j++){
                if(coins[i-1] <= j){
                    t[i][j] = Math.min(1 + t[i][j-coins[i-1]], t[i-1][j]);
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        
        return t[n][sum] == sum + 1 ? -1 : t[n][sum];
    }
}
