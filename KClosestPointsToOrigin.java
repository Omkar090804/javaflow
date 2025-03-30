//here we use max heap because max heep keeps the largest element at the top and we also pop from top so largest element that is the farthest from the origin will be popped and we will get the closest to the origin at the bottom of the heap

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1])        //generally java follows min hep(min number at top) as default but here we have placed b-a thats why max heap
        );                                                                             //(a, b) -> (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1]) 
                                                                                       //Computes squared distances for two points (a and b).
                                                                                       //// (1,2)=1^2+2^2=5

                                                                                       //Subtracts their values:

                                                                                          //If b is farther than a, it returns a positive number → meaning b should come before a (higher priority).

                                                                                           //If b is closer than a, it returns a negative number → meaning a should come first.

                                                                                           //This makes sure that the farthest point is at the top of the heap.
        for (int i = 0; i < points.length; i++) {
            pq.offer(points[i]); // Add point to heap
            
            if (pq.size() > k) {
                pq.poll();
            }
        }
        
        int[][] res = new int[k][2];
        int idx = 0;
        while (!pq.isEmpty()) {
            int[] point = pq.poll();
            res[idx++] = point;
        }
        
        return res;
    }
}
