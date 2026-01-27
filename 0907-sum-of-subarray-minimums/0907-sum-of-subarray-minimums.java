class Solution {

    int[] pse(int[] arr) {
        int n = arr.length;
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return pse;
    }

    int[] nse(int[] arr) {
        int n = arr.length;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return nse;
    }

    public int sumSubarrayMins(int[] arr) {
        int MOD = 1_000_000_007;
        long sum = 0;

        int[] pse = pse(arr);
        int[] nse = nse(arr);

        for (int i = 0; i < arr.length; i++) {
            long left = i - pse[i];
            long right = nse[i] - i;
            sum = (sum + left * right * arr[i]) % MOD;
        }

        return (int) sum;
    }
}
