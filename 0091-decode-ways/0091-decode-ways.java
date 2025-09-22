class Solution {
    public int Decode(String s,int i,int[] dp){
        if(i==s.length()){
            return 1;
        }
        if(s.charAt(i)=='0'){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int ways=Decode(s,i+1,dp);
        if((i+1)<s.length()){
            String substr=s.substring(i,i+2);
            int t=Integer.parseInt(substr);
            if(t>=10 && t<=26){
                ways+=Decode(s,i+2,dp);
            }
        }
        dp[i]=ways;
        return ways;
    }
    public int numDecodings(String s) {
        int[] dp=new int[s.length()];
        Arrays.fill(dp,-1);
        return Decode(s,0,dp);
    }
}