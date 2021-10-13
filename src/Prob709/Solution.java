package Prob709;

class Solution {

    public String toLowerCase(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        char diff = 'a' - 'A';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            stringBuilder.append((char) (('A' <= c && c <= 'Z') ? (c + diff) : c));
        }
        return stringBuilder.toString();
    }
}
