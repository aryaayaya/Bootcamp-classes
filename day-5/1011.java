// Capacity To Ship Packages Within D Days

class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int left = 0;
        int right = 0;

        // Find search range
        for (int weight : weights) {
            left = Math.max(left, weight);
            right += weight;
        }

        int answer = right;

        while (left <= right) {

            int capacity = left + (right - left) / 2;

            int daysNeeded = 1;
            int currentWeight = 0;

            for (int weight : weights) {

                if (currentWeight + weight > capacity) {
                    daysNeeded++;
                    currentWeight = 0;
                }

                currentWeight += weight;
            }

            // Capacity is sufficient
            if (daysNeeded <= days) {
                answer = capacity;
                right = capacity - 1;
            }

            // Capacity is insufficient
            else {
                left = capacity + 1;
            }
        }

        return answer;
    }
}
