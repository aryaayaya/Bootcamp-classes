// isomorphic string

import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> reverseMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // s -> t
            if (map.containsKey(c1) && map.get(c1) != c2) {
                return false;
            }

            // t -> s
            if (reverseMap.containsKey(c2) && reverseMap.get(c2) != c1) {
                return false;
            }

            map.put(c1, c2);
            reverseMap.put(c2, c1);
        }

        return true;
    }
}
