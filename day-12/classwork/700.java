// Search in a Binary Search Tree

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {

        // Value not found
        if (root == null) {
            return null;
        }

        // Found the value
        if (root.val == val) {
            return root;
        }

        // Search left
        if (val < root.val) {
            return searchBST(root.left, val);
        }

        // Search right
        return searchBST(root.right, val);
    }
}
