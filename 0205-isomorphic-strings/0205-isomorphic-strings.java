import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false; // Edge case check
        
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> reverseMap = new HashMap<>(); // To ensure one-to-one mapping
        
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // If mapping exists, check if it matches
            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) return false;
            } else {
                // Ensure two different keys don't map to the same value
                if (reverseMap.containsKey(c2)) return false;
                
                map.put(c1, c2);
                reverseMap.put(c2, c1);
            }
        }
        return true; // Fix: Should return true for isomorphic strings
    }
}
