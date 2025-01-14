class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int counter=0;
        int ans[]=new int[A.length];
        int freq[]=new int[A.length+1];
        for(int i=0;i<A.length;i++){
            freq[A[i]]++;
            freq[B[i]]++;
            if(freq[A[i]]%2==0){
                counter++;
            }
            if(A[i]!=B[i] && freq[B[i]]%2==0){
                counter++;
            }
            ans[i]=counter;
        }
        return ans;
    }
}