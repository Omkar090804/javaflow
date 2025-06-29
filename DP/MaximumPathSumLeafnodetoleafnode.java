//Given a binary tree in which each node element contains a number. Find the maximum possible path sum from one special node to another special node.

class Solution {
    int res;

    int solve(Node root) {
        if (root == null) {
            return 0;
        }

        int left = solve(root.left);
        int right = solve(root.right);

        if (root.left != null && root.right != null) {                //if node has left and right
            res = Math.max(res, left + right + root.data);
            return root.data + Math.max(left, right);
        }

        if (root.left == null && root.right == null) {          //if no left right
            return root.data;
        }

        if (root.left == null) {
            return root.data + right;
        } else {
            return root.data + left;
        }
    }

    int maxPathSum(Node root) {
        res = Integer.MIN_VALUE;
        int val = solve(root);

        // If no valid leaf-to-leaf path was found (e.g., skewed tree) skewed is where all nodes are on one side 
        if (root.left == null || root.right == null) {
            return Math.max(res, val);
        }

        return res;
    }
}
