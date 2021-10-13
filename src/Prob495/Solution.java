package Prob495;

class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int totalDuration = duration;
        for(int i = 0; i < timeSeries.length - 1; i++) {
            totalDuration += Math.min(duration, timeSeries[i+1] - timeSeries[i]);
        }
        return totalDuration;
    }
}