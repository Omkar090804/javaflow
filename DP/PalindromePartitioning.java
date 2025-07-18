/*
Given a string s, a partitioning of the string is a palindrome partitioning if every sub-string of the partition is a palindrome. Determine the fewest cuts needed for palindrome partitioning of the given string.
Examples:
Input: s = "geek" 
Output: 2 
Explanation: We need to make minimum 2 cuts, i.e., "g | ee | k".
*/

class Solution {

    static int[][] t;
    
    static int palPartition(String s) {
        int n = s.length();
        
        t = new int[n+1][n+1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                t[i][j] = -1;
            }
        }

        return solve(s, 0, n - 1);
    }

    static boolean isPalindrome(String s, int i, int j) {                 //checking if straing is palindrome 
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static int solve(String s, int i, int j) {
        if (t[i][j] != -1)
            return t[i][j];

        if (i >= j || isPalindrome(s, i, j)) {
            return t[i][j] = 0;
        }

        int minCuts = Integer.MAX_VALUE;

        for (int k = i; k < j; k++) {       //we can do same as matrix chain multiplication but for making it more optimized and to make all test cases run we do like this 
            int left, right;                //we check here if value of left part of string is stored in table if yes use it if no then do like we do in mcm so overall optimizing the code

            if (t[i][k] != -1)
                left = t[i][k];
            else
                left = solve(s, i, k);

            if (t[k + 1][j] != -1)
                right = t[k + 1][j];
            else
                right = solve(s, k + 1, j);

            int temp = left + right + 1;               //here 1 is added because we already make one partition to make i to k and then k+1 to j so 1 is added
            minCuts = Math.min(minCuts, temp);
        }

        return t[i][j] = minCuts;
    }
}
