class Solution {
    public int getSecondLargest(int[] arr) {
      
        int max= Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
      
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                secondmax = max;
                max=arr[i];
                
            }
             else if(secondmax < arr[i] && arr[i] < max ){
                secondmax= arr[i];
            }
           }
            if (secondmax == Integer.MIN_VALUE) {
            return -1;
        }
           return secondmax;
        }
    }
