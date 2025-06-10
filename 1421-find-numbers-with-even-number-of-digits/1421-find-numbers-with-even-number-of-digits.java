class Solution {
    public int digits(int num){
        int dig=0;
        while(num>0){
            num=num/10;
            dig++;
        }
        return dig;
    }
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(digits(nums[i])%2==0){
                count++;
            }
        }
        return count;
    }

}