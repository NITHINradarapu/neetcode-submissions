class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int n = row * col;
        int l = 0;
        int r = n - 1;

        while(l <= r){
            int mid = l + (r - l) / 2;
            int rowIdx = mid / col;
            int colIdx = mid % col;
            int val = matrix[rowIdx][colIdx];
            if(val == target){
                return true;
            }else if(val > target){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return false;
    }
}
