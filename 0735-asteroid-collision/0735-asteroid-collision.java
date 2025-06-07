class Solution {
    public int[] asteroidCollision(int[] nums) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                st.push(nums[i]);
            } else {
                while (!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(nums[i])) {
                    st.pop(); // Right-moving asteroid destroyed
                }

                if (!st.isEmpty() && st.peek() > 0 && st.peek() == Math.abs(nums[i])) {
                    st.pop(); // Both are equal, destroy both
                } else if (st.isEmpty() || st.peek() < 0) {
                    st.push(nums[i]); // No collision or stack has only left-moving
                }
                // else: current asteroid is destroyed, do nothing
            }
        }

        // Convert stack to array
        int[] res = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            res[i] = st.pop();
        }

        return res;
    }
}
