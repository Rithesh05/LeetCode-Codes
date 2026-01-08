class Solution {
    int subseq(String text1,String text2,int l1,int l2,int[][] dp){
        int temp=0;
        if(l1==-1 || l2==-1){
            return 0;
        }
        if(dp[l1+1][l2+1]!=-1) return dp[l1+1][l2+1];
        if(text1.charAt(l1)==text2.charAt(l2)) {
            temp=1+subseq(text1,text2,l1-1,l2-1,dp);
        }else{
            temp=Math.max(subseq(text1,text2,l1-1,l2,dp),subseq(text1,text2,l1,l2-1,dp));
        }
        dp[l1+1][l2+1]=temp;
        return temp;
    }
    public int longestCommonSubsequence(String text1, String text2) {
    int l1=text1.length();
    int l2=text2.length();
    int[][] dp=new int[l1+1][l2+1];
    for(int[] temp:dp){
        Arrays.fill(temp,-1);
    }
    int max=subseq(text1,text2,l1-1,l2-1,dp);
     return max;    
    }
}