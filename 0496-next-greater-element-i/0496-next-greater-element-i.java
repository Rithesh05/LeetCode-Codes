class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nge = new int[nums2.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums2[i] > stack.peek()) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                nge[i] = -1;
            } else {
                nge[i] = stack.peek();
            }
            stack.push(nums2[i]);
        }
        
        int temp=-1;
        int[] ans=new int[nums1.length];
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    ans[i]=nge[j];
                    break;
                }
            }
        }
        return ans;
    }
}