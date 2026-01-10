class Solution {

    int[][] dp;

    int mindeletions(String s1, String s2, int i, int j) {
        int l1 = s1.length();
        int l2 = s2.length();

        if (dp[i][j] != -1) return dp[i][j];

        // If s1 is exhausted
        if (i >= l1) {
            int sum = 0;
            for (int k = j; k < l2; k++) {
                sum += (int) s2.charAt(k);
            }
            return dp[i][j] = sum;
        }

        // If s2 is exhausted
        if (j >= l2) {
            int sum = 0;
            for (int k = i; k < l1; k++) {
                sum += (int) s1.charAt(k);
            }
            return dp[i][j] = sum;
        }

        // If characters match
        if (s1.charAt(i) == s2.charAt(j)) {
            return dp[i][j] = mindeletions(s1, s2, i + 1, j + 1);
        }

        // Delete from s1 or s2
        int del1 = (int) s1.charAt(i) + mindeletions(s1, s2, i + 1, j);
        int del2 = (int) s2.charAt(j) + mindeletions(s1, s2, i, j + 1);

        return dp[i][j] = Math.min(del1, del2);
    }

    public int minimumDeleteSum(String s1, String s2) {
        dp = new int[s1.length() + 1][s2.length() + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return mindeletions(s1, s2, 0, 0);
    }
}
