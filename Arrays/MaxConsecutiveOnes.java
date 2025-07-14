class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxcount=0;
        for(int i=0;i<nums.length;i++){
         if (nums[i]==1){
            count++;
         }
         else{
            maxcount=Math.max(maxcount,count);
            count=0;
         }
          maxcount = Math.max(maxcount, count);
        }
        return maxcount;
    }
}
