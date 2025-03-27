class Solution {
    public int myAtoi(String s) {
        int i = 0, sum = 0, mul = 1;

        // Skip leading spaces
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // Handle sign
        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            mul = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Process digits
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Basic overflow check
            if (sum > (Integer.MAX_VALUE - digit) / 10) {
                return (mul == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            sum = sum * 10 + digit;
            i++;
        }

        return sum * mul;
    }
}
