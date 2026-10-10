class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, ArrayList<String>> result = new HashMap<>(); //mapping char count
        for(String s : strs) {
            int[] count = new int[26];

            for(char c : s.toCharArray()) {
                count[c - 'a'] += 1;
            }

            String key = Arrays.toString(count); //turn freq count into String
            result.putIfAbsent(key, new ArrayList<>()); //create our new entry
            result.get(key).add(s); //add word to entry
        }

        return new ArrayList<>(result.values());
    }
}
