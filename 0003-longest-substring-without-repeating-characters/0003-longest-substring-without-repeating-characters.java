class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int len = 0;
        int k = 0;
        ArrayList<Character> list = new ArrayList<>();
        
        for (int i = 0; i < s.length(); i++) {
           
            if (list.contains(s.charAt(i))) {
                max = Math.max(max, len); 
             
                while (list.contains(s.charAt(i))) {
                    list.remove((Character) s.charAt(k)); 
                    k++;
                    len--; 
                }
            }
          
            list.add(s.charAt(i));
            len++; 
        }
        
    
        return Math.max(len, max); 
    }
}
