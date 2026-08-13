// top k frequent elements

import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Count frequency of each number
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Min Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> map.get(a) - map.get(b)
        );

        // Keep only k most frequent elements
        for (int num : map.keySet()) {

            pq.add(num);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        // Convert heap to array
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }

        return ans;
    }
}