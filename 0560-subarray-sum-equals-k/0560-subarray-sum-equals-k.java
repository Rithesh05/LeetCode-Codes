class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int sum=0;
        int len=nums.length-1;
        for(int i=0;i<=len;i++){
            sum=0;
            for(int j=i;j<=len;j++){
                sum=sum+nums[j];
                if(sum==k){
                count++;
               }      
            }
            
        }
        return count;
    }
}