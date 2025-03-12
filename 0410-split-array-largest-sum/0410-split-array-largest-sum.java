class Solution {
    public static int calk(int[] nums,int maxsum){
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum==maxsum){
                count++;
                sum=0;
            }
            if(sum>maxsum){
                count++;
                sum=nums[i];
            }
        }
        if(sum!=0){
            count++;
        }
        return count;
    }
    public int splitArray(int[] nums, int k) {
        int low=0;
        int high=0;
        int mid;
        for(int i=0;i<nums.length;i++){
            low=Math.max(low,nums[i]);
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            high=high+nums[i];
        }
        while(low<=high){
            mid=(low+high)/2;
            if(calk(nums,mid)<=k){
                ans=Math.min(ans,mid);
                high=mid-1;
            }
            if(calk(nums,mid)>k){
                low=mid+1;
            }
        }
        return ans;
        
    }
}