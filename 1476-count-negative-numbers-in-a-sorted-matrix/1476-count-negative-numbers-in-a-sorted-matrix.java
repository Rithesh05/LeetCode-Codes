class Solution {
    public int binarysearch(int[] arr){
        int l = 0;
        int h = arr.length - 1;
        int firstNegative = arr.length; 

        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] < 0) {
                firstNegative = mid; 
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return arr.length - firstNegative;
    }

    public int countNegatives(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][grid[i].length - 1] >= 0) {
              
                continue;
            }
            sum += binarysearch(grid[i]);
        }
        return sum;
    }
}
