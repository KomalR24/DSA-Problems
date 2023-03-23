// Link to Question:  https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1

class Solution {
    long maxSubarraySum(int arr[], int n){
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= n - 1; i++) {
            int currSum = 0;
            for (int j = i; j <= n - 1; j++) {
                currSum += arr[j];
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }
}
