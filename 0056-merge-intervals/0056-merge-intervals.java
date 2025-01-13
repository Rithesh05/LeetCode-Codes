import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[][] merge(int[][] intervals) {
        // Sort intervals by their starting times
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        ArrayList<int[]> list = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {
                // Extend the end time if intervals overlap
                end = Math.max(end, intervals[i][1]);
            } else {
                // Print and add the merged interval to the list
                System.out.println(start + " " + end);
                list.add(new int[] { start, end });
                // Update start and end for the next interval
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        // Add the last interval after the loop
        System.out.println(start + " " + end);
        list.add(new int[] { start, end });

        // Debugging: Print the list in a readable format
        for (int[] interval : list) {
            System.out.println(Arrays.toString(interval));
        }

        // Return the merged intervals as a 2D array
        return list.toArray(new int[list.size()][]);
    }
}
