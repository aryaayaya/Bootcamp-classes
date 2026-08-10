//  Group Anagrams

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            int[] count = new int[26];

            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }

            // Create a unique key
            StringBuilder key = new StringBuilder();

            for (int num : count) {
                key.append("#");
                key.append(num);
            }

            map.putIfAbsent(key.toString(), new ArrayList<>());
            map.get(key.toString()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}

