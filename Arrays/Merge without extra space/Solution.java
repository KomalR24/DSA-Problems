// Link to Question: https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1

class Solution {
    public static void merge(long arr1[], long arr2[], int n, int m)
    {
        int i = 0, j = 0, k = n - 1;
        while (i <= k && j < m) {
            if (arr1[i] < arr2[j])
                i++;
            else {
                long temp = arr2[j];
                arr2[j] = arr1[k];
                arr1[k] = temp;
                j++;
                k--;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
