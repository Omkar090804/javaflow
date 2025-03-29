public class SubsetSum {
    public static boolean isSubsetSum(int[] arr, int sum, int n) {
        boolean[][] t = new boolean[n+1][sum+1];
        
        // Initialize matrix
        for(int i = 0; i < sum+1; i++) t[0][i] = false;  // empty array can't make any sum (except 0)
        for(int j = 0; j < n+1; j++) t[j][0] = true;     // empty subset makes sum 0
        
        // Choice Diagram to code
        for(int i = 1; i < n+1; i++) {
            for(int j = 1; j < sum+1; j++) {
                if(arr[i-1] <= j) {
                    t[i][j] = t[i-1][j] || t[i-1][j-arr[i-1]];
                }
                else {
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }

    public static void main(String[] args) {
        int[] arr = new int[] {3, 34, 4, 12, 5, 2};
        int sum = 9;
        int n = arr.length;
        System.out.println(isSubsetSum(arr, sum, n));
    }
}
