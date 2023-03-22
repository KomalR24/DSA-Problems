// Link To Article:  https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/

class Solution {
    static void revereseArray(int arr[], int start, int end)
    {
        int temp;
        while (start < end)
        {   temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
