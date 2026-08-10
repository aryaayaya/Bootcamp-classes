 //Binary Tree Longest Consecutive Sequence

 class Solution {
    int maxLength = 0;

    public int longestConsecutive(TreeNode root) {
        dfs(root, 0, 0);
        return maxLength;
    }

    private void dfs(TreeNode node, int parentValue, int length) {

        if (node == null) {
            return;
        }

        if (node.val == parentValue + 1) {
            length++;
        } else {
            length = 1;
        }

        maxLength = Math.max(maxLength, length);

        dfs(node.left, node.val, length);
        dfs(node.right, node.val, length);
    }
}
