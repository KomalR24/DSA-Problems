// Link to Question: https://leetcode.com/problems/search-a-2d-matrix/description/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = 0, col = cols-1;

        while(row < rows && col > -1){
            int curr = matrix[row][col];
            if(curr==target) return true;
            if(curr < target) row++;
            else col--;
        }
        return false;
    }
}