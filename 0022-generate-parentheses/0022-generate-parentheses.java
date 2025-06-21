class Solution {
    static void generate(ArrayList<String> list,String str,int o,int c){
        if(o==0 && c==0){
            list.add(str);
            return;
        }
        if(c>o){
            generate(list,str+")",o,c-1);
        }
        if(o>0){
            generate(list,str+"(",o-1,c);
        }
        

    }

    public List<String> generateParenthesis(int n) {
        int open=n;
        int close=n;
        ArrayList<String> list=new ArrayList<>();
        generate(list,"",open,close);
        return list;
    }
}