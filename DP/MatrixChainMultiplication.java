/* Matrix Chain Multiplication steps
1) take values of i,j
2) Write a base condition 
3) Create a loop for k according to situatiion 
4) find temp ans which we need to calculate for all values of k and then out of them we take the minimum as answer as we need min cost
5) printting minimum cost
*/
 
public class MatrixChainMultiplication {

    public static int solve(int[] arr, int i, int j) {
        if (i >= j)                                             //base condn
            return 0;

        int ans = Integer.MAX_VALUE;

        for (int k = i; k <= j - 1; k++) {   //k loop this is always same...this is too break the array into two sections one from i to k and other from k+1 to j and then multiply those values with each other to find the total cost
            int tempAns = solve(arr, i, k) + solve(arr, k + 1, j) + arr[i - 1] * arr[k] * arr[j];  // this arr[i - 1] * arr[k] * arr[j] is the extra cost which comes while calculating both parts of array  solve(arr, i, k) part and olve(arr, k + 1, j this part 
            ans = Math.min(ans, tempAns);
        }

        return ans;
    }
    }
