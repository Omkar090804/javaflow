class Solution {
    public static int minCost(int[] arr) {
      PriorityQueue<Integer> pq = new PriorityQueue<>();            
        
        for(int i=0;i<arr.length;i++){                  //here we put all ropes together in pq but in k colsest points we put each point one by one 
            pq.offer(arr[i]);
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
