class Solution {
    public static void backtrack(int[] arr,int target,int i,List<List<Integer>> list,ArrayList<Integer> sublist){
        if(target==0){
            list.add(new ArrayList<>(sublist));
            return;
        }
        if(target<0 || i>=arr.length){
            return;
        }
        sublist.add(arr[i]);
        backtrack(arr,target-arr[i],i,list,sublist);
        sublist.remove(sublist.size()-1);

        backtrack(arr,target,i+1,list,sublist);
    }



    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> list=new ArrayList<>();
        backtrack(arr,target,0,list,new ArrayList<>());
        return list;
    }
}