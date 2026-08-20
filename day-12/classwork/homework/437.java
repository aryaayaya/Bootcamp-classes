// path sum 3

import java.util.HashMap;

class Solution {

    public int pathSum(TreeNode root, int targetSum) {

        HashMap<Long, Integer> map = new HashMap<>();

        // Sum 0 exists once
        map.put(0L, 1);

        return dfs(root, 0, targetSum, map);
    }

    private int dfs(TreeNode node, long currentSum,
                     int targetSum, HashMap<Long, Integer> map) {

        if (node == null) {
            return 0;
        }

        // Add current node
        currentSum += node.val;

        // Check if a previous prefix sum exists
        long required = currentSum - targetSum;

        int count = map.getOrDefault(required, 0);

        // Add current prefix sum
        map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);

        // Search left and right
        count += dfs(node.left, currentSum, targetSum, map);
        count += dfs(node.right, currentSum, targetSum, map);

        // Backtrack
        map.put(currentSum, map.get(currentSum) - 1);

        return count;
    }
}


