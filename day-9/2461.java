// Maximum Sum of Distinct Subarrays With Length K

import java.util.HashMap;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        long sum = 0;
        long maxSum = 0;

        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            // Add current element
            sum += nums[right];
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            // Keep window size exactly k
            if (right - left + 1 > k) {

                int leftValue = nums[left];

                sum -= leftValue;

                map.put(leftValue, map.get(leftValue) - 1);

                if (map.get(leftValue) == 0) {
                    map.remove(leftValue);
                }

                left++;
            }

            // All k elements are distinct
            if (right - left + 1 == k && map.size() == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}
