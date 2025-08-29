class Solution {
    public String maximumOddBinaryNumber(String s) {
     String ans="";
     int[] arr=new int[2];
     for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='0'){
            arr[0]++;
        }
        else{
            arr[1]++;
        }
     }
      while(arr[1]>1){
        ans=ans+"1";
        arr[1]--;
      }
      while(arr[0]>0){
        ans=ans+"0";
        arr[0]--;
      }
      if(arr[1]==1){
        ans=ans+"1";
      }
      return ans;
    }
}