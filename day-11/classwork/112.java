// path sum

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null) {
            return false;
        }

        // Check if current node is a leaf
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }

        // Subtract current value and search children
        int remaining = targetSum - root.val;

        return hasPathSum(root.left, remaining)
                || hasPathSum(root.right, remaining);
    }
}
