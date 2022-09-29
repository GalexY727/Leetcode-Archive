class Solution {
    int count;
    public int totalNQueens(int n) {
        count = 0;
        boolean[][]arr = new boolean[n][n];
        nQueens(arr, 0);
        return count;
    }
    
    public boolean isQueenSafeToPlace(boolean[][] arr, int r, int c) {
        //top-left diagonal
        for(int i = r, j = c; i>=0 && j>=0; i--,j--) {
            if(arr[i][j] == true) {
                return false;
            }
        }
        
        //top-row
        for(int i = r; i>=0; i--) {
            if(arr[i][c] == true) {
                return false;
            }
        }
        
        //top-right diagonal
        for(int i = r, j = c; i>=0 && j<arr.length; i--,j++) {
            if(arr[i][j] == true) {
                return false;
            }
        }
        
        return true;
    }
    public void nQueens(boolean[][]arr, int row) {
        if(row == arr.length) {
            count++;
            return;
        }
        
        for(int col = 0; col<arr.length; col++) {
            
            if(isQueenSafeToPlace(arr, row, col) == true) {
                arr[row][col] = true;
                nQueens(arr, row+1);
                arr[row][col] = false;
            }
        }
    }
}