// diameter of a binary tree

class Solution {
    private int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return diameter;
    }

    private int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftDepth = depth(node.left);
        int rightDepth = depth(node.right);

        // Update the diameter if the path through the current node is longer
        diameter = Math.max(diameter, leftDepth + rightDepth);

        // Return the depth of the current node
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
