class Solution {
    public static void backtrack(int[] arr,int k,int n,int i,List<List<Integer>> list,List<Integer> slist){
        if(slist.size()==k && n==0){
            list.add(new ArrayList<>(slist));
            return;
        }
        if(n<0 || i>=arr.length){
            return;
        }
        slist.add(arr[i]);
        backtrack(arr,k,n-arr[i],i+1,list,slist);
        slist.remove(slist.size()-1);

        backtrack(arr,k,n,i+1,list,slist);
    }



    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr=new int[]{1,2,3,4,5,6,7,8,9};
        List<List<Integer>> list=new ArrayList<>();
        backtrack(arr,k,n,0,list,new ArrayList<>());
        return list;

    }
}