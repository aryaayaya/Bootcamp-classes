// Permutation in String


class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] count = new int[26];

        // Count characters in s1
        for (char c : s1.toCharArray()) {
            count[c - 'a']++;
        }

        int windowSize = s1.length();

        // Sliding window
        for (int i = 0; i < s2.length(); i++) {

            // Add current character
            count[s2.charAt(i) - 'a']--;

            // Remove character outside the window
            if (i >= windowSize) {
                count[s2.charAt(i - windowSize) - 'a']++;
            }

            // Check if frequencies match
            if (allZero(count)) {
                return true;
            }
        }

        return false;
    }

    private boolean allZero(int[] count) {

        for (int num : count) {
            if (num != 0) {
                return false;
            }
        }

        return true;
    }
}