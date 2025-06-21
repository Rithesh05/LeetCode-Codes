class Solution {
    public double power(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;

        double half = power(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }

    public double myPow(double x, int n) {
        if (n < 0) {
            return 1.0 / power(x, -n);
        } else {
            return power(x, n);
        }
    }
}
