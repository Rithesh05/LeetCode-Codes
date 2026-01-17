class pair {
    int num;
    int count;
    pair(int num, int count) {
        this.num = num;
        this.count = count;
    }
}

class Solution {
    public int[] frequencySort(int[] nums) {

        // Step 1: Sort array
        Arrays.sort(nums);

        // Step 2: Min-heap with tie-breaker
        PriorityQueue<pair> q = new PriorityQueue<>(
            (a, b) -> {
                if (a.count != b.count)
                    return a.count - b.count;     // frequency ascending
                return b.num - a.num;             // value descending
            }
        );

        // Step 3: Count frequencies
        int num = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == num) {
                count++;
            } else {
                q.add(new pair(num, count));
                num = nums[i];
                count = 1;
            }
        }
        q.add(new pair(num, count)); // last element

        // Step 4: Build result array
        int[] res = new int[nums.length];
        int idx = 0;

        while (!q.isEmpty()) {
            pair p = q.poll();
            for (int i = 0; i < p.count; i++) {
                res[idx++] = p.num;
            }
        }

        return res;
    }
}
