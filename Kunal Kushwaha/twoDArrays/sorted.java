package twoDArrays;
//https://leetcode.com/problems/search-a-2d-matrix/description/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = 0, c = matrix[0].length - 1;

        while (c >= 0 && r <= matrix.length - 1) {
            if (target == matrix[r][c]) {

                return true;

            }
            if (target < matrix[r][c]) {
                c--;
            } else {
                r++;

            }
        }

        return false;

    }
}
