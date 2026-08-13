class Solution {
    public String decodeAtIndex(String s, int k) {

        long size = 0;

        // Find the length of decoded string
        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                size *= ch - '0';
            } else {
                size++;
            }
        }

        // Work backwards
        for (int i = s.length() - 1; i >= 0; i--) {

            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {

                size /= ch - '0';

                k = (int)(k % size);

            } else {

                if (k == 0 || k == size) {
                    return String.valueOf(ch);
                }

                size--;
            }
        }

        return "";
    }
}
