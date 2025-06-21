class Solution {
    static void generate(int[] nums, int i, List<List<Integer>> list, List<Integer> sublist) {
        if (i == nums.length) {
            list.add(new ArrayList<>(sublist)); // Make a copy to avoid reference issues
            return;
        }

        // Include nums[i]
        sublist.add(nums[i]);
        generate(nums, i + 1, list, sublist);

        // Backtrack and exclude nums[i]
        sublist.remove(sublist.size() - 1);
        generate(nums, i + 1, list, sublist);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        generate(nums, 0, list, new ArrayList<>());
        return list;
    }
}
