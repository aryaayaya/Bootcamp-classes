class Solution {
    public char findKthBit(int n, int k) {

        String s = "0";

        for (int i = 2; i <= n; i++) {

            StringBuilder reverseInvert = new StringBuilder();

            for (int j = s.length() - 1; j >= 0; j--) {

                if (s.charAt(j) == '0') {
                    reverseInvert.append('1');
                } else {
                    reverseInvert.append('0');
                }
            }

            s = s + "1" + reverseInvert;
        }

        return s.charAt(k - 1);
    }
}
