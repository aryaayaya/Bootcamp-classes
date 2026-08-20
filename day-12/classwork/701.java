// Insert into a Binary Search Tree

class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {

        // Empty position found
        if (root == null) {
            return new TreeNode(val);
        }

        // Go left
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        }

        // Go right
        else {
            root.right = insertIntoBST(root.right, val);
        }

        return root;
    }
}
