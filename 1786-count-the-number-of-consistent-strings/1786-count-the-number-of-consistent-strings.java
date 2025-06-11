class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] allowedChars = new boolean[26];

        // Mark allowed characters using for loop
        for (int i = 0; i < allowed.length(); i++) {
            allowedChars[allowed.charAt(i) - 'a'] = true;
        }

        int count = 0;

        // Loop through each word
        for (int i = 0; i < words.length; i++) {
            boolean isValid = true;

            // Check each character in the word
            for (int j = 0; j < words[i].length(); j++) {
                char c = words[i].charAt(j);
                if (!allowedChars[c - 'a']) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                count++;
            }
        }

        return count;
    }
}
