// Link to Question: https://practice.geeksforgeeks.org/problems/inversion-of-array-1587115620/1

class Solution {
    static long mergeSort(long[] a, int low, int high) {
        long count = 0;
        if (low < high) {
            int mid = (low + high) / 2;
            count += mergeSort(a, low, mid);
            count += mergeSort(a, mid + 1, high);
            count += merge(a, low, mid, high);
        }
        return count;
    }
    static long merge(long[] a, int low, int mid, int high) {
        int n = mid - low + 1;
        int m = high - mid;
        long[] left = new long[n];
        long[] right = new long[m];
        for (int i = 0; i < n; i++)
            left[i] = a[low + i];
        for (int j = 0; j < m; j++)
            right[j] = a[mid + 1 + j];
        int i = 0, j = 0, k = low;
        long count = 0;
        while (i < n && j < m) {
            if (left[i] <= right[j])
                a[low++] = left[i++];
            else {
                a[low++] = right[j++];
                count += n - i;
            }
        }
        while (i < n)
            a[low++] = left[i++];
        while (j < m)
            a[low++] = right[j++];
        return count;

    }
    static long inversionCount(long arr[], long N) {
        int low = 0, high = (int) (N - 1);
        return mergeSort(arr, low, high);
    }
}
