class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int carry = 0;
        int sum = 0;
        int i = num.length - 1;

        while (i >= 0 || k > 0 || carry > 0) {
            int digitFromNum = i >= 0 ? num[i] : 0;
            int digitFromK = k % 10;
            sum = digitFromNum + digitFromK + carry;

            list.add(sum % 10);
            carry = sum / 10;

            k = k / 10;
            i--;
        }

        Collections.reverse(list);
        return list;
    }
}
