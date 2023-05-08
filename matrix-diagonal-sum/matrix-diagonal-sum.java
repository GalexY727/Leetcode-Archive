class Solution {
    public int diagonalSum(int[][] mat) {
        int total = 0;
        int j = mat.length-1;
        for (int i = 0; i < mat.length; i++)
        {
            total += (mat[i][i]) + ((i != j) ? mat[i][j] : 0);
            j--;
        }
        return total;
    }
}