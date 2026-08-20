//  Maximum Number of Vowels in a Substring of Given Length

class Solution {
    public int maxVowels(String s, int k) {

        int count = 0;
        int maxVowels = 0;

        // First window
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

        maxVowels = count;

        // Slide the window
        for (int i = k; i < s.length(); i++) {

            // Remove left character
            if (isVowel(s.charAt(i - k))) {
                count--;
            }

            // Add new right character
            if (isVowel(s.charAt(i))) {
                count++;
            }

            maxVowels = Math.max(maxVowels, count);
        }

        return maxVowels;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' ||
               c == 'o' || c == 'u';
    }
}
