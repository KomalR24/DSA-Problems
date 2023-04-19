// Link to Question: https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int i = 0, j = m-1;
        int firstMaxRow = -1;
        while(i<n && j>=0){
            if(arr[i][j] == 1){
                firstMaxRow = i;
                j--;
            }else{
                i++;
            }
        }
        return firstMaxRow;
    }
}