class Solution {
    public boolean isValid(String s) {
         Stack<Character> ls = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);

            if (a == '(' || a == '{' || a == '[') {
                ls.push(a);
            } else {
                if (ls.isEmpty()) return false;

                if ((a == ')' && ls.peek() == '(') ||
                    (a == '}' && ls.peek() == '{') ||
                    (a == ']' && ls.peek() == '[')) {
                    ls.pop();
                } else {
                    return false;
                }
            }
        }

        return ls.isEmpty();
        
    }
}