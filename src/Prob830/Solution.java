package Prob830;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        int i = 0, gs = 0; char prevChar = 0;
        List<List<Integer>> ret = new ArrayList<>();
        while (i < s.length()) {
            var t = s.charAt(i++);
            if (prevChar != t )  {
                if (i-gs > 3)  {
                    ret.add(Arrays.asList(gs, i-2));
                }
                gs = i-1;
            }
            prevChar = t;
        }

        if (i-gs >= 3)  {
            ret.add(Arrays.asList(gs, i-1));
        }
        return ret;
    }
}

