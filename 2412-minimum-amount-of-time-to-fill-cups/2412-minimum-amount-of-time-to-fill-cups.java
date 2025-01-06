import java.util.*;

class Solution {
    public int fillCups(int[] amount) {
        if (amount.length == 1) {
            return amount[0];
        }

        // Convert array to a list for easier manipulation
        List<Integer> list = new ArrayList<>();
        for (int i : amount) {
            list.add(i);
        }

        Collections.sort(list, Collections.reverseOrder()); // Sort in descending order
        int count = 0;

        while (list.get(0) != 0) {
            count++;
            
            // Decrement the first element
            list.set(0, list.get(0) - 1);

            if (list.get(1) > 0) {
                // Decrement the second element
                list.set(1, list.get(1) - 1);
            }

            Collections.sort(list, Collections.reverseOrder()); // Re-sort after decrementing
        }

        return count;
    }
}
