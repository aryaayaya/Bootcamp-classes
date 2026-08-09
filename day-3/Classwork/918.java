//Maximum Sum Circular Subarray

class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int totalSum = 0;

        int currentMax = nums[0];
        int maxSum = nums[0];

        int currentMin = nums[0];
        int minSum = nums[0];

        for (int i = 0; i < nums.length; i++) {

            totalSum += nums[i];

            if (i > 0) {

                // Kadane for maximum subarray
                currentMax = Math.max(nums[i], currentMax + nums[i]);
                maxSum = Math.max(maxSum, currentMax);

                // Kadane for minimum subarray
                currentMin = Math.min(nums[i], currentMin + nums[i]);
                minSum = Math.min(minSum, currentMin);
            }
        }

        // If all numbers are negative
        if (maxSum < 0) {
            return maxSum;
        }

        // Maximum circular sum
        int circularSum = totalSum - minSum;

        return Math.max(maxSum, circularSum);
    }
}
