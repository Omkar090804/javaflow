// // User function Template for Java

class Solution {
    public void rotate(int[] arr) {
        int n = arr.length;

        // Step 1: Reverse from 0 to n-2         //ex 1,2,3,4,5   so after this 4,3,2,1,5
        omkar(arr, 0, n - 2);

        // Step 2: Reverse last element (n-1 to n-1)           //4,3,2,1,5
        omkar(arr, n - 1, n - 1); // Optional

        // Step 3: Reverse the whole array                   //complete array is reversed so 5,1,2,3,4
        omkar(arr, 0, n - 1);
    }
    
    public void omkar(int[] arr,int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}


//Left rotate by k 

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int n=arr.length;
        
        d = d % n; // prevent d from exceeding array length
        if (d == 0 || n == 0) return; // no need to rotate

       
        rotate(arr,0,d-1);
        rotate(arr,d,n-1);
        rotate(arr,0,n-1);
    }
    
static void rotate(int arr[],int start,int end){
    while(start < end){
       int temp = arr[start];
       arr[start]=arr[end];
       arr[end]=temp;
       start++;
       end--;
    }
 }
    
}
