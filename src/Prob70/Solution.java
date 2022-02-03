package Prob70;

class Solution {
    public int climbStairs(int n) {
        int[] waysToClimbToN = new int[n+1];
        waysToClimbToN[0] = 1;
        waysToClimbToN[1] = 1;
        for(var i = 2; i <= n; i++) {
            waysToClimbToN[i] = waysToClimbToN[i-1] + waysToClimbToN[i-2];
        }
        return waysToClimbToN[n];
    }
}