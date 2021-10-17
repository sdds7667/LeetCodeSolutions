package prob1013;

class Solution {
    // TODO : implement O(n)
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum0 = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            sum0 += arr[i];
            sum1 = arr[i+1];
            sum2 = 0;
            for (int j = i+2; j < arr.length; j++) {
                sum2 += arr[j];
            }
            if (sum0 == sum1 && sum1 == sum2) return true;
            for (int j = i+2; j < arr.length - 1; j++) {
                sum1 += arr[j];
                sum2 -= arr[j];
                if (sum0 == sum1 && sum1 == sum2) return true;
            }
        }
        return false;
    }
}