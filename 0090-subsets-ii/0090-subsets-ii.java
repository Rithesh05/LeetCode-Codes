class Solution {
    public static void backtrack(int[] nums,int i,List<List<Integer>> list,ArrayList<Integer> slist){
        ArrayList<Integer> temp=new ArrayList<>(slist);
        if(i==nums.length){
        if(!list.contains(temp)){
            list.add(temp);
            return;
        }
        return;
         }
        
        slist.add(nums[i]);
        backtrack(nums,i+1,list,slist);
        slist.remove(slist.size()-1);

        backtrack(nums,i+1,list,slist);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        backtrack(nums,0,list,new ArrayList<>());
        return list;
    }
}