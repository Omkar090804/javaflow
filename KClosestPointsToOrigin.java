//here we use max heap because max heep keeps the largest element at the top and we also pop from top so largest element that is the farthest from the origin will be popped and we will get the closest to the origin at the bottom of the heap

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1])
        );
        
        for (int[] point : points) {
            pq.offer(point);
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
