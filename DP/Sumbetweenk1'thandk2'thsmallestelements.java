class Solution {
    
    public static long sumBetweenTwoKth(long A[], long N, long K1, long K2) {
        Arrays.sort(A);
        
        long sum = 0;                                             //here k starts from 1,2...and array start from 0,1....
        for (int i = (int)K1; i < K2 - 1; i++) {                  //ex : sorted array
                                                                    // [4,8,10,12,14,20,22]
                                                                       // where k1=3 and k2=6 
            sum += A[i];                                                //so we need 12+14=26 and those elements are
        }

        return sum;
    
    }
}
