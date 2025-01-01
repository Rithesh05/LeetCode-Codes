class Solution {
    public boolean isPalindrome(String s) {
        String temp="";
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='0' && s.charAt(i)<='9')){
                temp=temp+s.charAt(i);
            }
        }
        int j=temp.length()-1;
        for(int i=0;i<temp.length()/2;i++){
            if(temp.charAt(i)!=temp.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
}