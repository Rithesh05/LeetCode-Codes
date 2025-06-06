class Solution {
    public int finalValueAfterOperations(String[] op) {
        int num=0;
        for(int i=0;i<op.length;i++){
            if(op[i].equals("++X")){
                ++num;
            }else if(op[i].equals("X++")){
                num++;
            }else if(op[i].equals("--X")){
                --num;
            }else if(op[i].equals("X--")){
                num--;
            }
        }
        return num;
    }
}