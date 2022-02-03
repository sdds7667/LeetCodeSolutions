package Prob18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int sum;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(var i = 0; i < nums.length - 3; i++) {
            if (nums[i] > target && nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i-1]) continue;
            for (int j = i+1; j < nums.length - 2; j++) {
                if (nums[j] + nums[i] > target && nums[j] > 0) break;
                if (j > i+1 && nums[j] == nums[j-1]) continue;

                int low = j + 1, high = nums.length - 1;
                while (low < high) {
                    sum = nums[i] + nums[j] + nums[low] + nums[high];
                    if (sum > target) {
                        high--;
                    } else if (sum < target){
                        low++;
                    } else {
                        int x, y;
                        result.add(List.of(nums[i], nums[j], x = nums[low], y = nums[high]));
                        while(low < high && nums[low] == x) low++;
                        while(low < high && nums[high] == y) high--;
                    }
                }
            }
        }
        return result;
    }
}