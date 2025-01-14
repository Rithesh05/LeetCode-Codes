class Solution {
    public int firstMissingPositive(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for (int num : nums) {
        set.add(num);
    }
    int n=1;
    while(set.contains(n)){
        n++;
    }
    return n;
    }
}