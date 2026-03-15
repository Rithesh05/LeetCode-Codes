class Solution {
    public int getLucky(String s, int k) {
        HashMap<Character,String> map=new HashMap<>();
        String ans="";
        int sum=0;
        if(k==0){
            return 0;
        }
        k=k-1;
        for(int i=0;i<s.length();i++){
            int curr=(int)(s.charAt(i))-96;
            ans=ans+(curr+"");
        }
        while(k>=0){
           int tempsum=0;
           for(int i=0;i<ans.length();i++){
            tempsum=tempsum+Integer.parseInt(ans.charAt(i)+"");
           }
           ans=tempsum+"";
           k=k-1; 
        }
        System.out.println(ans);
      return Integer.parseInt(ans);
        
    }
}