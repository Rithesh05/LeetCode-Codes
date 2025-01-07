    class Solution {
    public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> ans = new ArrayList<>();

    for (int i = 1; i <= numRows; i++) {
    ArrayList<Integer> list = new ArrayList<>();

    if (i == 1) {
    list.add(1); // First row: [1]
    } else {
    list.add(1); // First element of the row is always 1

    for (int j = 2; j < i; j++) {
    // The inner elements are the sum of two elements from the previous row
    int val = ans.get(i - 2).get(j - 1) + ans.get(i - 2).get(j - 2);
    list.add(val);
    }

    list.add(1); // Last element of the row is always 1
    }

    ans.add(list); // Add the list to the answer
    }

    return ans;
    }
    }

    