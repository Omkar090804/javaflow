//Matrix Chain Multiplication




public class MatrixChainMultiplication {

    public static int solve(int[] arr, int i, int j) {
        if (i >= j)
            return 0;

        int ans = Integer.MAX_VALUE;

        for (int k = i; k <= j - 1; k++) {
            int tempAns = solve(arr, i, k) + solve(arr, k + 1, j) + arr[i - 1] * arr[k] * arr[j];
            ans = Math.min(ans, tempAns);
        }

        return ans;
    }
    }
