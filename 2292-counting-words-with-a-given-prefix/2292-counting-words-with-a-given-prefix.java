class Solution {
    public boolean prefix(String word,String prefix){
        if(word.length()<prefix.length()){
            return false;
        }
        for(int i=0;i<prefix.length();i++){
            if(!(word.charAt(i)==prefix.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(int i=0;i<words.length;i++){
            if(prefix(words[i],pref)){
                count++;
            }
        }
        return count;
    }
}