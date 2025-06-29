/*
Given a binary tree, the task is to find the maximum path sum. The path may start and end at any node in the tree.
*/

class Solution {
    public int res;

    public int solve(Node root) {
        if (root == null) {
            return 0;
        }
        
        int left = Math.max(0, solve(root.left));
        int right = Math.max(0, solve(root.right));
        
    
        int temp = root.data + Math.max(left, right);
        

        int answer = root.data + left + right;

        res = Math.max(res, answer);

        return temp;
    }

    public int findMaxSum(Node node) {
        res = Integer.MIN_VALUE;
        solve(node);
        return res;
    }
}
