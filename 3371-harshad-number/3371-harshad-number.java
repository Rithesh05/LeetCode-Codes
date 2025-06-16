class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int temp=x;
        int rem;
        int sum=0;
        while(x>0){
            rem=x%10;
            sum=sum+rem;
            x=x/10;
        }
        if(temp%sum==0){
            return sum;
        }
        return -1;
    }
}