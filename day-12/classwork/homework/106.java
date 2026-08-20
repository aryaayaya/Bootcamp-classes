// construct binary tree from inorder and postorder traversal

class Solution {

    int postIndex;
    HashMap<Integer, Integer> inorderMap = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        postIndex = postorder.length - 1;

        // Store inorder values and their indexes
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return build(inorder, postorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] inorder, int[] postorder,
                           int left, int right) {

        // No elements
        if (left > right) {
            return null;
        }

        // Last postorder element is the root
        int rootValue = postorder[postIndex--];

        TreeNode root = new TreeNode(rootValue);

        int index = inorderMap.get(rootValue);

        // IMPORTANT: Build right first
        root.right = build(inorder, postorder, index + 1, right);

        // Then build left
        root.left = build(inorder, postorder, left, index - 1);

        return root;
    }
}
