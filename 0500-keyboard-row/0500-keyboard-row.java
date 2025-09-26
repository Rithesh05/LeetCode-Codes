class Solution {
    public String[] findWords(String[] words) {
        String[] board=new String[]{"qwertyuiop","asdfghjkl","zxcvbnm"};
        ArrayList<String> ans=new ArrayList<>();
        for(String curr:words){
            int index=1;
            String crnt=curr.toLowerCase();
            for(int i=0;i<3;i++){
                if(board[i].contains(crnt.charAt(0)+"")){
                    index=i;
                    break;
                }
            }
            boolean isTrue=true;
            int prev=index;
            for(int i=1;i<crnt.length();i++){
                if(!board[prev].contains(crnt.charAt(i)+"")){
                    isTrue=false;
                    break;
                }
            }
            if(isTrue){
                ans.add(curr);
            }
        }
        String[] output=new String[ans.size()];
        for(int i=0;i<output.length;i++){
            output[i]=ans.get(i);
        }
        return output;
    }
}