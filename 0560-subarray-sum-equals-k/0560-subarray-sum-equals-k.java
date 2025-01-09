class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int diff;
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            diff=sum-k;
            if(map.containsKey(diff)){
                count=count+map.get(diff);
            }
            if(!(map.containsKey(sum))){
                map.put(sum,1);
            }else{
                map.put(sum,map.get(sum)+1);
            }


        }
        return count;
    }
}