package Prob84;

import java.util.Stack;


class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] nextSmallerLeft = new int[heights.length];
        int[] nextSmallerRight = new int[heights.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < heights.length; i++) {
            while(!stack.empty() && heights[i] <= heights[stack.peek()]) stack.pop();
            if (stack.empty()) nextSmallerLeft[i] = 0;
            else nextSmallerLeft[i] = stack.peek() + 1;
            stack.push(i);
        }
        stack.clear();

        for (int i = heights.length-1; i >= 0; i--) {
            while(!stack.empty() && heights[i] <= heights[stack.peek()]) stack.pop();
            if (stack.empty()) nextSmallerRight[i] = heights.length - 1;
            else nextSmallerRight[i] = stack.peek() - 1;
            stack.push(i);
        }
        stack.clear();

        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < heights.length; i++) {
            maxArea = Math.max(maxArea, (nextSmallerRight[i] - nextSmallerLeft[i] + 1) * heights[i]);
        }
        return maxArea;
    }
}