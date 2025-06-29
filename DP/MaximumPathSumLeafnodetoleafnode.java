class Solution {
    int res;

    int solve(Node root) {
        if (root == null) {
            return 0;
        }

        int left = solve(root.left);
        int right = solve(root.right);

        if (root.left != null && root.right != null) {
            res = Math.max(res, left + right + root.data);
            return root.data + Math.max(left, right);
        }

        if (root.left == null && root.right == null) {
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

        // If no valid leaf-to-leaf path was found (e.g., skewed tree)
        if (root.left == null || root.right == null) {
            return Math.max(res, val);
        }

        return res;
    }
}
