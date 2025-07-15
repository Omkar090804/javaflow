/*
Given an array of integers, every element in the array appears twice except for one element which appears only once. The task is to identify and return the element that occurs only once.

Examples: 

Input:  arr[] = [2, 3, 5, 4, 5, 3, 4]
Output: 2 
Explanation: Since 2 occurs once, while other numbers occur twice, 2 is the answer.
  */

class Solution {
    public int findUnique(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i+=2){
            if(arr[i]!=arr[i+1]){
               return arr[i];
            }
        }
    return arr[arr.length-1];
    }
}
