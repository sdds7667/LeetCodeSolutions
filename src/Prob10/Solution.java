package Prob10;

import java.util.Arrays;

class Solution {
    public boolean isMatch(String s, String p) {

        return dp(s, p, s.length(), p.length(), new int[s.length()+1][p.length()+1]) == 1;
    }

    public static int dp(String s, String p, int i, int j, int[][] mem) {
        if (j < 0) return -1;
        if (i < 0) return -1;
        if (j == 0) return (i == 0) ? 1 : -1;
        if (mem[i][j] != 0) return mem[i][j];
        if (i == 0) {
            if (p.charAt(j-1) == '*') {
                return (mem[i][j] = dp(s, p, i, j - 2, mem));
            } else return (mem[i][j] = -1);
        }

        if (p.charAt(j-1) != '*') {
            if (!matches(s, p, i-1, j-1)) {
                return (mem[i][j] = -1);
            } else{
                return (mem[i][j] = dp(s, p, i-1, j-1, mem));
            }
        } else {
            if (matches(s, p, i-1, j-2))
                return (mem[i][j] = Math.max(dp(s, p, i-1, j, mem), dp(s, p, i, j-2, mem)));
            else
                return (mem[i][j] = dp(s, p, i, j-2, mem));
        }
    }

    public static boolean matches(String s, String p, int i, int j) {
        if (p.charAt(j) == '.') return true;
        return p.charAt(j) == s.charAt(i);
    }
}