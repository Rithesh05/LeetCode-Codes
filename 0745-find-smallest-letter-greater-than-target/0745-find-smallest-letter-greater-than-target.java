class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
       Arrays.sort(letters);
        int asc=(int)target;
        char ans=letters[0];
        for(int i=0;i<letters.length;i++){
            if(asc<(int)letters[i]){
                ans=letters[i];
                break;
            }
        }
        return ans;
    }
}