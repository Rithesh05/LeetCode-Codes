class Solution {
    public int isVowel(String a){
        if((a.charAt(0)=='a' ||a.charAt(0)=='e' ||a.charAt(0)=='i' ||a.charAt(0)=='o' ||a.charAt(0)=='u') && ((a.charAt(a.length()-1)=='a' ||a.charAt(a.length()-1)=='e' ||a.charAt(a.length()-1)=='i' ||a.charAt(a.length()-1)=='o' ||a.charAt(a.length()-1)=='u'))){
            return 1;
        }
        return 0;
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] ans=new int[words.length];
        for(int i=0;i<words.length;i++){
            if(isVowel(words[i])==1){
                ans[i]=1;
            }else{
                ans[i]=0;
            }
        }
        int[] sum=new int[ans.length+1];
        sum[0]=0;
        for(int i=1;i<=ans.length;i++){
            sum[i]=sum[i-1]+ans[i-1];
        }
        int[] ans1=new int[queries.length];
        for(int i=0;i<queries.length;i++){
                int start=queries[i][0];
                int end=queries[i][1];
                ans1[i]=sum[end+1]-sum[start];
        }
        return ans1;
    }
}