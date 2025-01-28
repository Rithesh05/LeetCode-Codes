class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0;  // Left pointer
        int max = 0;  // Maximum length of the window
        int zeroCount = 0;  // Count of zeros in the current window

        for (int j = 0; j < nums.length; j++) {
            // Expand the window by including nums[j]
            if (nums[j] == 0) {
                zeroCount++;
            }

            // If the count of zeros exceeds k, shrink the window from the left
            while (zeroCount > k) {
                if (nums[i] == 0) {
                    zeroCount--;
                }
                i++;  // Move the left pointer
            }

            // Calculate the maximum length of the window
            max = Math.max(max, j - i + 1);
        }

        return max;
    }
}
