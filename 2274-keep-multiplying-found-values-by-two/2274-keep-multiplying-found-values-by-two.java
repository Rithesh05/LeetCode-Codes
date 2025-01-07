class Solution {
    public int findFinalValue(int[] nums, int original) {
        ArrayList<Integer> list=new ArrayList<>();
        int temp=original;
        for(int k:nums){
            list.add(k);
        }
        while(list.contains(temp)){
            temp=temp*2;
        }
        return temp;
    }
}