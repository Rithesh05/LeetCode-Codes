class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(1)));
        for(int i=1;i<=rowIndex;i++){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int k=0;k<=i;k++){
                if(k==0 || k==i){
                    temp.add(1);
                }else{
                temp.add(list.get(i-1).get(k-1)+list.get(i-1).get(k));
                }
            }
            list.add(temp);
        }
        return list.get(rowIndex);
    }
}