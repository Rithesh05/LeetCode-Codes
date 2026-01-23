class Solution {
    boolean IsVowel(String s1){
        String s=s1.toLowerCase().trim();
        char fir=s.charAt(0);
        char last=s.charAt(s.length()-1);
        return (fir=='a' || fir=='e' ||fir=='i' || fir=='o' || fir=='u') && (last=='a' || last=='e' ||last=='i' || last=='o' || last=='u');
    }
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            if(IsVowel(words[i])){
                count++;
            }
        }
        return count;
    }
}