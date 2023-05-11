class Solution {
    public int[][] generateMatrix(int n) {
        int l_wall = -1, r_wall = n, u_wall = 0, d_wall = n;
        char direction = 'r';
        int[][] result = new int[n][n];
        int i = 0, j = 0, k = 1;
        while(k <= Math.pow(n,2)) {
            // System.out.println(k + " " +  i + " " + j);
            result[i][j] = k;
            k++;
            if(direction == 'r') {
                j++;
                if(j == r_wall) {
                    r_wall--;
                    j = r_wall;
                    direction = 'd';
                    i++;
                }
            }
            else if(direction == 'd') {
                i++;
                if(i == d_wall) {
                    d_wall--;
                    i = d_wall;
                    direction = 'l';
                    j--;
                }
            }
            else if(direction == 'l') {
                j--;
                if(j == l_wall) {
                    l_wall++;
                    j = l_wall;
                    direction = 'u';
                    i--;
                }
            }
            else if(direction == 'u') {
                i--;
                if(i == u_wall) {
                    u_wall++;
                    i = u_wall;
                    direction = 'r';
                    j++;
                }
            }
        }
        return result;
    }
}