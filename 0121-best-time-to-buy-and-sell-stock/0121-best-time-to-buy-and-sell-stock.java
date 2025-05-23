class Solution {
    public int maxProfit(int[] arr) {
        int min=arr[0];
        int pro=0;
        for(int i=0;i<arr.length;i++){
            min=Math.min(arr[i],min);
            pro=Math.max(pro,arr[i]-min);
        }
        return pro;
    }
}