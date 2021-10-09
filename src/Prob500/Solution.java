package Prob500;


class Solution {
    public String[] findWords(String[] words) {
        int[] row = new int[]{22790416, 265961, 44052486};
        boolean[] solution = new boolean[words.length];
        int wc = 0;
        for (int i = 0; i < words.length; i++) {
            int wordSet = 0;
            for (int j = 0; j < words[i].length(); j++) {
                int ci = words[i].charAt(j) - 'a';
                if (ci < 0) ci += 32;
                wordSet |= (1 << ci);
            }
            solution[i] = ((wordSet & row[0]) == wordSet || ((wordSet & row[1]) == wordSet) || (wordSet & row[2]) == wordSet);
            wc += (solution[i] ? 1 : 0);
        }
        String[] result = new String[wc];
        int ind = 0;
        for (int i = 0; i < solution.length; i++) {
            if (solution[i]) result[ind++] = words[i];
        }
        return result;
    }
}
