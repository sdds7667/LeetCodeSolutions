package Prob1455;

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int wi = 1, wci = 0;
        boolean ws = true;
        for (int i = 0; i < sentence.length(); i++) {
            if (ws && searchWord.charAt(wci++) == sentence.charAt(i) ) {
                if (wci == searchWord.length()) return wi;
            } else if (sentence.charAt(i) == ' ') {
                ws = true;
                wci = 0;
                wi ++;
            } else {
                ws = false;
            }
        }
        return -1;
    }
}
