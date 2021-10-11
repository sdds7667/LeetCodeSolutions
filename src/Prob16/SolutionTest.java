package Prob16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void leetCode1() {
        int[] arr = new int[]{3, 0, 1, 1, 9, 7};
        int a = 7, b = 2, c = 3;

        var result = new Solution().countGoodTriplets(arr, a, b, c);

        assertEquals(4, result);
    }

    @Test
    public void leetCode2() {
        int[] arr = new int[]{1, 1, 2, 2, 3};
        int a = 0, b = 0, c = 1;
        var result = new Solution().countGoodTriplets(arr, a, b, c);
        assertEquals(0, result);
    }

}