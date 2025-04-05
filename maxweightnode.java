class Solution {
    public int maxWeightCell(int[] exits) {
        int maxWeight = -1;
        int result = 0;
        int[] weight = new int[exits.length];

        for (int i = 0; i < exits.length; i++) {
            int dest = exits[i];
            if (dest != -1) {
                weight[dest] += i;
                if (weight[dest] > maxWeight || (weight[dest] == maxWeight && dest > result)) {
                    maxWeight = weight[dest];
                    result = dest;
                }
            }
        }

        return result;
    }
}
