class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int longlen=0;
        int curr=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int currele=num;
                curr=0;
                while(set.contains(currele)){
                    curr++;
                    currele++;
                }
                longlen=Math.max(longlen,curr);
            }
        }
        return longlen;
    }
}