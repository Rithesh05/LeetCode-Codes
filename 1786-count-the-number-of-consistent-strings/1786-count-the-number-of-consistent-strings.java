class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        boolean temp=false;
        for(int i=0;i<words.length;i++){
            temp=true;
            for(int j=0;j<words[i].length();j++){
                if(!allowed.contains(words[i].charAt(j)+"")){
                    temp=false;
                    break;
                }
            }
            if(temp){
                count++;
            }
        }
        
        return count;
    }
}