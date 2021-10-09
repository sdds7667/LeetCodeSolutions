package Prob1021;


class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder finalString = new StringBuilder();
        int currentLevel = 0;
        int primitiveIndexStart = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if ((--currentLevel) == 0) {
                    finalString.append(s, primitiveIndexStart + 1, i);
                    primitiveIndexStart = i + 1;
                }
            } else currentLevel ++;
        }
        return finalString.toString();
    }
}
