package Prob1672;

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int cw = 0;
            for (int i : account) {
                cw += i;
            }
            maxWealth = Math.max(maxWealth, cw);
        }
    
        return maxWealth;
    }
}