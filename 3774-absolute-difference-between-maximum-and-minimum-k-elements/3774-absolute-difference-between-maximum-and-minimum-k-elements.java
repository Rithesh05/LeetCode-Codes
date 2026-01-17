class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        int len=nums.length-1;
        for(int i=0;i<k;i++){
            sum=sum-nums[len];
            len--;
        }
        return Math.abs(sum);

    }
}