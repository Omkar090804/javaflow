class Solution {
    public static int minCost(int[] arr) {
        if(arr.length<2){
            return 0;
        }
      PriorityQueue<Integer> pq = new PriorityQueue<>();              //min heap
        
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int totalcost=0;
        
        while(pq.size()>1){
            int first=pq.poll();
            int second=pq.poll();
            int cost=first+second;
            totalcost=totalcost+cost;
            pq.add(cost);
            
        }
        return totalcost;
    }
}
