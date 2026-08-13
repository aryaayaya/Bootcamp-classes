class Solution {
    public int[] sortArrayByParityII(int[] nums) {

        int even = 0;
        int odd = 1;

        while (even < nums.length && odd < nums.length) {

            // Find wrong even position
            while (even < nums.length && nums[even] % 2 == 0) {
                even += 2;
            }

            // Find wrong odd position
            while (odd < nums.length && nums[odd] % 2 != 0) {
                odd += 2;
            }

            // Swap
            if (even < nums.length && odd < nums.length) {
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
            }
        }

        return nums;
    }
}
