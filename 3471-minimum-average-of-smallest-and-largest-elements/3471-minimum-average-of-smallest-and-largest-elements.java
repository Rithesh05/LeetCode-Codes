class Solution {
    public double minimumAverage(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int temp:nums){
            list.add(temp);
        }
        Collections.sort(list);
        double min=Integer.MAX_VALUE;
        while(!list.isEmpty()){
            double a=list.get(0);
            double b=list.get(list.size()-1);
            min=Math.min(min,(double)(a+b)/2);
            list.remove(0);
            list.remove(list.size()-1);
        }
        return min;

    }
}