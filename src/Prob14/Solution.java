package Prob14;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch(c) {
                case '[':
                case '{':
                case '(': brackets.push(s.charAt(i)); break;
                case ']':
                    if (brackets.size() == 0 || brackets.pop() != '[') return false;
                    break;
                case '}':
                    if (brackets.size() == 0 ||brackets.pop() != '{') return false;
                    break;
                case ')':
                    if (brackets.size() == 0 ||brackets.pop() != '(') return false;
                    break;
            }
        }
        return brackets.isEmpty();
    }
}