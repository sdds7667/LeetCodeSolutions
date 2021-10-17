package prob1047;

class Solution {
    public String removeDuplicates(String s) {
        char[] resStack = new char[s.length()];
        int resStackLength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (resStackLength != 0 && s.charAt(i) == resStack[resStackLength - 1]) {
                resStackLength--;
            } else {
                resStack[resStackLength++] = s.charAt(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < resStackLength; i++) {
            sb.append(resStack[i]);
        }
        return sb.toString();
    }
}