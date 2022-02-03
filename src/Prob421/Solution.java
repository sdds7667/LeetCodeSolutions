package Prob421;

public class Solution {
    public int findMaximumXOR(int[] nums) {
        int maxXOR = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for(int j = i; j < nums.length; j++) {
                maxXOR = Math.max(maxXOR, nums[i] ^ nums[j]);
            }
        }
        return maxXOR;
    }
}
