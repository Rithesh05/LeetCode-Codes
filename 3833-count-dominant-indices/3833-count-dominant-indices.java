class Solution {
    public int dominantIndices(int[] nums) {
        int n = nums.length;
        double[] pre = new double[n];

        pre[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            pre[i] = nums[i] + pre[i + 1];
        }

        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            double avg = pre[i + 1] / (n - i - 1);
            if (nums[i] > avg) {
                count++;
            }
        }
        return count;
    }
}
