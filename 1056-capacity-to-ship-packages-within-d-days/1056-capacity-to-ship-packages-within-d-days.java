class Solution {
    int countdays(int[] weights,int capacity){
        int sum=0;
        int count=0;
        for(int i=0;i<weights.length;i++){
            sum=sum+weights[i];
            if(sum>capacity){
                count++;
                sum=weights[i];
            }
        }
        if(sum!=0){
            count++;
        }
        return count;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        int mid=0;
        for(int i=0;i<weights.length;i++){
            high=high+weights[i];
            low=Math.max(weights[i],low);
        }
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            mid=(low+high)/2;
            
            if(countdays(weights,mid)<=days){
                high=mid-1;
                ans=Math.min(ans,mid);
            }else{
                low=mid+1;
            }
        }
        return ans;
        
    }
}