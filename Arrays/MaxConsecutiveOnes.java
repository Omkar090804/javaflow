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


//if both one and zeros 

class Solution {
    public int maxConsecBits(int[] arr) {
       
        int countones=0;
        int maxcountones=0;
        int countzeros=0;
        int maxcountzeros=0;
        
        for(int i=0;i<arr.length;i++){
         if (arr[i]==1){
            countones++;
            countzeros=0;
         }
         else{
            countzeros++;
            countones=0;
         }
          maxcountones = Math.max(maxcountones, countones);
          maxcountzeros=Math.max(maxcountzeros,countzeros);
        }
        return Math.max(maxcountones,maxcountzeros);
    }
}
        
    

