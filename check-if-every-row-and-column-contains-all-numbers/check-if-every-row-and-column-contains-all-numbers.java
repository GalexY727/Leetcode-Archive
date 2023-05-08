class Solution {
    public boolean checkValid(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            Set<Integer> row = new HashSet<Integer>();
            Set<Integer> col = new HashSet<Integer>();
            for (int j = 0; j < matrix.length; j++) {
                if (col.contains(matrix[i][j]) || row.contains(matrix[j][i])) {
                    return false;
                }
                col.add(matrix[i][j]);
                row.add(matrix[j][i]);
            }
        }
        return true;
    }
}