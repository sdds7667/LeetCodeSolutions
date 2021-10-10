package Prob1971;

import org.junit.jupiter.params.provider.Arguments;

import java.util.ArrayList;

class Solution {
    public boolean validPath(int n, int[][] edges, int start, int end) {
        boolean[] visited = new boolean[n];
        ArrayList<Integer>[] adjMatrix = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adjMatrix[i] = new ArrayList<>();
        }
        for (int[] edge: edges) {
            adjMatrix[edge[0]].add(edge[1]);
            adjMatrix[edge[1]].add(edge[0]);
        }
        return dfs(visited, adjMatrix, start, end);
    }
    private boolean dfs(boolean[] visited, ArrayList<Integer>[] adjMatrix, int currentNode, int end) {
        visited[currentNode] = true;
        if (currentNode == end) return true;
        for(int i: adjMatrix[currentNode]) {
            if (visited[i]) continue;
            if (dfs(visited, adjMatrix, i, end)) return true;
        }
        return false;
    }

    public int binSearch(int[][] edges, int key) {
        int low = 0;
        int high = edges.length;
        while (low < high) {
            int mid = (low + high) / 2;
            // since I need to find first occurrence, don't break.
            if (edges[mid][0] >= key) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}