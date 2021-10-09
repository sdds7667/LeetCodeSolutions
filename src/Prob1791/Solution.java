package Prob1791;

class Solution {
    public int findCenter(int[][] edges) {
        int v0 = edges[0][0];
        if (edges[1][0] == v0) return v0;
        if (edges[1][1] == v0) return v0;
        return edges[0][1];
    }
}