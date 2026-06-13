class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList<>();
        }
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            int[] freqArray = new int[26];
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                freqArray[ch - 'a']++;
            }
            String key = Arrays.toString(freqArray);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
