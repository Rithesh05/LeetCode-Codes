class Solution {
    long getSum(int[] piles,long num){
        long sum=0;
        for(int i=0;i<piles.length;i++){
            sum=sum+(long)Math.ceil((double)piles[i]/num);
        }
        return sum;
    }
    public int minEatingSpeed(int[] piles, int h) {
        long low=1;
        long high=0;
        for(int i=0;i<piles.length;i++){
            high=Math.max(piles[i],high);
        }
        long mid;
        long ans=0;
        while(low<=high){
            mid=(low+high)/2;
            if(getSum(piles,mid)<=h){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return (int)ans;
    }
}