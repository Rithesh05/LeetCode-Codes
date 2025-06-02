import java.util.ArrayList;

class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                list.add(ch);
            } else {
                if (list.isEmpty())
                    return false;

                char temp = list.remove(list.size() - 1);

                if (ch == ')' && temp != '(')
                    return false;
                if (ch == ']' && temp != '[')
                    return false;
                if (ch == '}' && temp != '{')
                    return false;
            }
        }

        return list.isEmpty(); // All brackets must be matched
    }
}
