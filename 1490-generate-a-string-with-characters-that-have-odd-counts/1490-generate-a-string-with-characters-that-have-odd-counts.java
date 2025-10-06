class Solution {
    public String generateTheString(int n) {
        String ans="";
        if(n%2==0){
            ans="";
            for(int i=0;i<n-1;i++){
                ans=ans+'a';
            }
            ans=ans+'b';
            return ans;
        }
        for(int i=0;i<n;i++){
            ans=ans+'a';
        }
        return ans;
    }
}