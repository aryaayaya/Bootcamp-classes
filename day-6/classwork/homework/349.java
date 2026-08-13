import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();

        // Put nums1 elements into set
        for (int num : nums1) {
            set1.add(num);
        }

        Set<Integer> result = new HashSet<>();

        // Check nums2 elements
        for (int num : nums2) {
            if (set1.contains(num)) {
                result.add(num);
            }
        }

        // Convert HashSet to int[]
        int[] ans = new int[result.size()];

        int i = 0;

        for (int num : result) {
            ans[i] = num;
            i++;
        }

        return ans;
    }
}
