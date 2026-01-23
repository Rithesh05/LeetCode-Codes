class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++)
        {
            String word=words[i];
        
            char ch=word.charAt(0);
            char ch1=word.charAt(word.length()-1);
            if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' )&& (ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')){
            count++;
        }
        }
      return count;
    }
}