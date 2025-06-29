
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
