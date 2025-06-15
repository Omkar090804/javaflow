class Solution {
    static int findTargetSumWays(int N, int[] A, int target) {
        int total = 0;

        for (int i = 0; i < N; i++) {
            total += A[i];
        }

        if ((total + target) % 2 != 0 || (total + target) < 0) {
            return 0;
        }

        int sum1 = (total + target) / 2;

        int[][] t = new int[N + 1][sum1 + 1];

        for (int i = 0; i <= N; i++) {
            t[i][0] = 1;
        }

        for (int i = 1; i < N+1; i++) {
            for (int j = 0; j < sum1+1; j++) {
                if (A[i - 1] > j) {
                    t[i][j] = t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j] + t[i - 1][j - A[i - 1]];
                }
            }
        }

        return t[N][sum1];
    }
}
