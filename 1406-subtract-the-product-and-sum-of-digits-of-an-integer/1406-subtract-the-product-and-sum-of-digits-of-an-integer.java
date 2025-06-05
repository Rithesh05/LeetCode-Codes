class Solution {
    public int subtractProductAndSum(int n) {
        int product=1;
        int sum=0;
        int temp;
        while(n>0){
            temp=n%10;
            product=product*temp;
            sum=sum+temp;
            n=n/10;
        }
        return product-sum;
    }
}