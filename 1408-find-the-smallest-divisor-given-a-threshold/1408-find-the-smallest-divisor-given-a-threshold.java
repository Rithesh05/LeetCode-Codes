class Solution {
    int ReturnSum(int[] nums,int divisor){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+(int)Math.ceil((double)nums[i]/divisor);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=Integer.MIN_VALUE;
        int mid;
        int ans=-1;
        for(int i=0;i<nums.length;i++){
          
            high=Math.max(high,nums[i]);      
        }
        while(low<=high){
            mid=(low+high)/2;
            if(ReturnSum(nums,mid)<=threshold){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}