// Link to Question: https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1

class Solution {
    public static void sort012(int arr[], int n)
    {
        int low = 0;
        int mid = 0;
        int high = n-1;
        int temp = 0;

        while(mid<=high){
            switch(arr[mid]){
                case 0:{
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    temp = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = temp;
                    high--;
                    break;
                }
            }
        }
    }
}
