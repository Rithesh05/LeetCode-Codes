class Solution {
    public boolean isHappy(int n) {
        int sum = 0;

        while (true) {
            sum = 0;  

            while (n > 0) {
                sum = sum + ((n % 10) * (n % 10));
                n = n / 10;
            }

            n = sum;   

            if (n == 1) {
                return true;
            }

            if (n == 4) {   
                return false;
            }
        }
    }
}