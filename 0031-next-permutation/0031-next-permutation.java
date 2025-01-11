class Solution {
    public static void reverse(int[] arr, int start) {
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void nextPermutation(int[] nums) {
        int bp = -1; // Breakpoint index
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                bp = i - 1;
                break;
            }
        }
        if (bp == -1) {
            reverse(nums, 0);
        } else {
            int seclow = -1; // Second-lowest index to swap
            for (int i = nums.length - 1; i > bp; i--) {
                if (nums[i] > nums[bp]) {
                    seclow = i;
                    break;
                }
            }
            swap(nums, seclow, bp);
            reverse(nums, bp + 1);
        }
    }
}
