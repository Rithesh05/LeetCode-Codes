class Solution {
    public boolean power(int n,int pow){
        if(Math.pow(3,pow)==n){
            return true;
        }
        if(Math.pow(3,pow)>n || n<=0){
            return false;
        }
        return power(n,pow+1);
    }
    public boolean isPowerOfThree(int n) {
        return power(n,0);
    }
}