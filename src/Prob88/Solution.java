package Prob88;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n >= 0) System.arraycopy(nums1, 0, nums1, n, m);
        int li = 0, ri = 0, fi = 0;
        while (li < m && ri < n) {
            if (nums1[n+li] < nums2[ri]) {
                nums1[fi++] = nums1[n+li++];
            }else{
                nums1[fi++] = nums2[ri++];
            }
        }
        while (li < m) {
            nums1[fi++] = nums1[n+li++];
        }
        while (ri < n) {
            nums1[fi++] = nums2[ri++];
        }
    }
}
