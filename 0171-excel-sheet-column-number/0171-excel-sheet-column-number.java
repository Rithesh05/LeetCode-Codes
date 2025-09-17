class Solution {
    public int titleToNumber(String str) {
        int su=0;
        for(int i=0;i<str.length();i++){
            su=su*26+(str.charAt(i)-'A'+1);
        }
        return su;
    }
}