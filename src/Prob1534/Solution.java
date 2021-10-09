package Prob1534;

import java.util.Arrays;

class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int solutions = 0;
        for(var i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if ((Math.abs(arr[i] - arr[j]) <= a) && (Math.abs(arr[j] - arr[k]) <= b) && (Math.abs(arr[i] - arr[k]) <= c))
                        solutions ++;
                }
            }
        }
        return solutions;
    }


    public static int customBinarySearch(int[] arr, int s, int k) {
        int h = arr.length;
        while (s < h) {
            int m = (s+h)/2;
            if (arr[m] >= k) {
                h = m;
            } else {
                s = m + 1;
            }
        }
        return s;
    }


}