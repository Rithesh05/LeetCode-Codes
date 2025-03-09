class Solution {
    boolean findValid(int[] arr,int m,int k,int j){
        int sum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=j){
                count++;
            }else{
                sum=sum+(count/k);
                count=0;
            }
        }
        sum=sum+(count/k);
        return sum>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        int mid;
        int ans=-1;
        for(int i=0;i<bloomDay.length;i++){
            low=Math.min(low,bloomDay[i]); //find low
            high=Math.max(high,bloomDay[i]); //find high
        }
        while(low<=high){
            mid=(low+high)/2;
            if(findValid(bloomDay,m,k,mid)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;

    }
}