/*
Problem: Group Anagrams
Category: Hashing, Strings
Difficulty: Medium
Approach: HashMap with sorted character array as keys
Time Complexity: O(N * K log K)
Space Complexity: O(N * K)
*/

class GroupAnagrams_LC49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (!ans.containsKey(key)) {
                ans.put(key, new ArrayList<>());
            }
            ans.get(key).add(s);
        }
        return new ArrayList<>(ans.values());        
    }
}