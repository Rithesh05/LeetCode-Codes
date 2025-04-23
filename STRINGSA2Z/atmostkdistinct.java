package STRINGSA2Z;

import java.util.*;
// Input: s = "aab", k = 1  
// Output: ["a", "aa", "b"]
// Input: s = "abc", k = 2
// Output: ["a", "ab", "b", "bc", "c"]

public class atmostkdistinct {
    public static Set<String> generatesubstr(String str, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        int left = 0;
        int right = 0;
        char curr;
        for (right = 0; right < str.length(); right++) {
            curr = str.charAt(right);
            set.add(Character.toString(curr));
            if (map.containsKey(curr)) {
                map.put(curr, map.get(curr) + 1);
            } else {
                map.put(curr, 1);
            }

            if (map.size() > k) {
                left++;
                map.remove(str.charAt(left));

            }
            set.add(str.substring(left, right + 1));
        }
        return set;
    }

    public static void main(String[] args) {
        System.out.println(generatesubstr("aaaabb", 2));
    }
}
