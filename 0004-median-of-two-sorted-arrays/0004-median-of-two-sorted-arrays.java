class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            nums3[i]=nums1[i];
        }
        int k=nums1.length;
        for(int i=0;i<nums2.length;i++,k++){
            nums3[k]=nums2[i];
        }
        int len=nums3.length;
        Arrays.sort(nums3);
        if(len%2!=0){
            return (double)nums3[len/2];
        }
        return (double)(nums3[(len/2)]+nums3[(len/2)-1])/2;
    }
}