class Solution {
    public int[] searchRange(int[] nums, int x) {
        int[] ans={-1,-1};
        int low=0;
        int high=nums.length-1;
        int mid;
        int temp1,temp2;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]==x){
                temp1=mid;
                temp2=mid;
                while(temp1>=0 && nums[temp1]==x){
                    ans[0]=temp1;
                    temp1--;
                }
                while(temp2<nums.length && nums[temp2]==x){
                    ans[1]=temp2;
                    temp2++;
                }
                break;
                // System.out.println(mid);
                

            }else if(nums[mid]<x){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
}