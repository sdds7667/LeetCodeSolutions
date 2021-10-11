package Prob88;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] finalArray = new int[n+m];
        int li = 0, ri = 0, fi = 0;
        while (li < m && ri < n) {
            if (nums1[li] < nums2[ri]) {
                finalArray[fi++] = nums1[li++];
            }else{
                finalArray[fi++] = nums2[ri++];
            }
        }
        System.arraycopy(finalArray, 0, nums1, 0, finalArray.length);
    }
}
