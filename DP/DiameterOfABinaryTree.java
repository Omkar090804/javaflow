/*
Given a binary tree, the diameter (also known as the width) is defined as the number of edges on the longest path between two leaf nodes in the tree. This path may or may not pass through the root. Your task is to find the diameter of the tree.

Examples:
Input: root[] = [1, 2, 3]

      1  
   /     \ 
2           3

Output: 2
Explanation: The longest path has 2 edges (node 2 -> node 1 -> node 3).
*/

class Solution {
    public int res; 

    public int solve(Node root) {
        if (root == null) return 0;

        int leftHeight = solve(root.left);
        int rightHeight = solve(root.right);

        int tempHeight = 1 + Math.max(leftHeight, rightHeight);

        int ans = leftHeight + rightHeight + 1;

        res = Math.max(res, ans);

        return tempHeight;
    }

    int diameter(Node root) {
        
        res = Integer.MIN_VALUE;

        solve(root);

        // Return diameter in terms of edges, so subtract 1
        return res - 1;
    }
}
