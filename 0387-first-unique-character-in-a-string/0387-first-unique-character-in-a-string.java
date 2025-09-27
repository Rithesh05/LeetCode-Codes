import java.util.*;

class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26]; // only lowercase letters
        // Count frequency
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        // Find first non-repeating
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
