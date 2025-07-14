class Solution {
    public int removeDuplicates(int[] nums) {
        
        if (nums.length == 0) return 0;

        int index = 0;  // to store the index of last unique element

        for (int i = 1; i < nums.length; i++) { 
            if (nums[i] != nums[index]) {
                index++;
                nums[index] = nums[i];
            }
        }
        return index + 1;
    }
}
