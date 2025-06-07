class Solution {
    public String removeKdigits(String num, int k) {
    Stack<Character> st=new Stack<>();
    if(num.length()<=k){
        return "0";
    }
    for(int i=0;i<num.length();i++){
        while(!st.isEmpty() && k>0 && st.peek()-'0'>num.charAt(i)-'0'){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while (k-- > 0) {
            st.pop();
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        ans.reverse();
        
        while (ans.length() > 1 && ans.charAt(0) == '0') {
            ans.deleteCharAt(0);
        }
        return ans.toString();
    }
}