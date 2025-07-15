import java.util.*;;

class Solution {
    int missingNum(int arr[]) {
       Arrays.sort(arr);
       int count=arr[0];
       for(int i=0;i<arr.length;i++){
           if(arr[i]!=count){
               return count;
              
           }
            count++;
       }
        return count;
    }
}
