class Solution {
    int steps=0;
    public int numberOfSteps(int num) {
        if(num==0){
            return steps;
        }
        if(num%2==0){
            return 1+numberOfSteps(num/2);
        }
       
            return 1+numberOfSteps(num-1);
        
    }
}