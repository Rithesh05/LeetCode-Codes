class Solution {
    List<List<String>> ans=new ArrayList<>();
    boolean isPalindrome(String s){
        int len=s.length();
        int j=len-1;
        for(int i=0;i<(len/2);i++){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
    void recur(String s,int i,List<String> temp){
        int len=s.length();
        if(i==len){
            ans.add(new ArrayList<>(temp));
            return;
        }
        String t="";
        for(int k=i;k<len;k++){
            t=t+s.charAt(k)+"";
            if(isPalindrome(t)){
                temp.add(t);
                recur(s,k+1,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<String> temp=new ArrayList<>();
        recur(s,0,temp);
        return ans;
    }
}