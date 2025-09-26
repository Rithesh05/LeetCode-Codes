class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] chararr=new int[256];
        for(int i=0;i<magazine.length();i++){
            chararr[(int)magazine.charAt(i)]= chararr[(int)magazine.charAt(i)]+1;
        }
        for(int i=0;i<ransomNote.length();i++){
            chararr[(int)ransomNote.charAt(i)]= chararr[(int)ransomNote.charAt(i)]-1;
            if(chararr[(int)ransomNote.charAt(i)]==-1){
                return false;
            }
        }
        return true;
        

    }
}