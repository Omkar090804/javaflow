class Solution {
    void pushZerosToEnd(int[] arr) {
        int start = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                swap(arr, start, i);
                start++;
            }
        }
    }

    void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
