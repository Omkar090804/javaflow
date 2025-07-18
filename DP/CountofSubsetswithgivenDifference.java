//example [1, 1, 2, 3] here d=1 so subsets can be [1,3][1,2] and [1,3][1,2](this 1 is 1 at second index) [1,1,2][3] so output = 3 
class Solution {
    public int countPartitions(int[] arr, int d) {
        int n = arr.length;
        int totalSum = 0;

        for (int i = 0; i < n; i++) {                                                     
            totalSum += arr[i];
        }

        if ((totalSum + d) % 2 != 0)
            return 0;

        int sum1 = (totalSum + d) / 2;

        int[][] t = new int[n + 1][sum1 + 1];

        for (int i = 0; i <= n; i++) {
            t[i][0] = 1;  //  only one way to make sum 0 (empty subset)
        }

        for (int i = 1; i < n+1; i++) {
            for (int j = 0; j < sum1+1; j++) {
                if (arr[i - 1] > j) {
                    t[i][j] = t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j] + t[i - 1][j - arr[i - 1]];
                }
            }
        }

        return t[n][sum1];
    }
}
