class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> lis=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j] && !lis.contains(nums1[i])) lis.add(nums1[i]);
            }
        }
        int[] arr=new int[lis.size()];
        for(int i=0;i<lis.size();i++){
            arr[i]=lis.get(i);
        }
        return arr;
    }
}