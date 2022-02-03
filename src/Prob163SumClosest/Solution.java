package Prob163SumClosest;

import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {

        // double pointer
        if (nums.length <= 3) return Arrays.stream(nums).sum();

        Arrays.sort(nums);
        int smallestSum = nums[0] + nums[1] + nums[2];
        int diff = Math.abs(smallestSum - target);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i-1] == nums[i]) continue;
            int low = i+1, high = nums.length - 1;
            while(low < high) {
                int newSum = nums[i] + nums[low] + nums[high];
                int newDiff = Math.abs(newSum-target);

                if (newSum > target) {
                    high --;
                    if (newDiff < diff) {
                        diff = newDiff;
                        smallestSum = newSum;
                    }
                } else if (newSum < target) {
                    low ++;
                    if (newDiff < diff) {
                        diff = newDiff;
                        smallestSum = newSum;
                    }
                } else {
                    return newSum;
                }
            }
        }
        return smallestSum;
    }
}