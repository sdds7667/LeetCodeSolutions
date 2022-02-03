package Prob153sum;

import java.util.*;

// idea from the internet
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        var result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        // fix a number, search the two remaining numbers
        int sum;
        for(var i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i-1]) continue;

            int low = i + 1, high = nums.length - 1;
            while (low < high) {
                sum = nums[i] + nums[low] + nums[high];
                if (sum > 0) {
                    high--;
                } else if (sum < 0){
                    low++;
                } else {
                    int x, y;
                    result.add(List.of(nums[i], x = nums[low], y = nums[high]));
                    while(low < high && nums[low] == x) low++;
                    while(low < high && nums[high] == y) high--;
                }
            }
        }
        return result;
    }
}
