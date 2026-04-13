class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> maps = new HashMap<>();
        HashMap<Character,Integer> mapt = new HashMap<>();

        for(char c: s.toCharArray()) {
            maps.put(c,maps.getOrDefault(c,0)+1);
        }
         for(char c: t.toCharArray()) {
            mapt.put(c,mapt.getOrDefault(c,0)+1);
        }

        boolean isAna = true;
        if(maps.size()!= mapt.size()) {
            return false;
        }
        for(Map.Entry<Character,Integer> entry: maps.entrySet()) {
            if(maps.size()!= mapt.size()) {
            return false;
        }
            char c = entry.getKey();
            int val = entry.getValue();
            if(!mapt.containsKey(c) || mapt.get(c)!= val) {
                return false;
            }
        }
        return true;
    }
}
