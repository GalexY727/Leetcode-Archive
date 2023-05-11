/*
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int direction = 1;
        int north = 0;
        int east  = 1;
        int south = 2;
        int west  = 3;


        int r = 0;
        int c = -1;
        int maxr = matrix.length-1;
        int maxc = matrix[0].length-1;
        int minr = 1;
        int minc = 0;

        int product = matrix.length*matrix[0].length;
        while (list.size() < product)
        {
            switch (direction) {
                case 2:
                    r++;
                    if (r < maxr) {
                        list.add(matrix[r][c]);
                    }
                    else {
                        direction = west;
                        maxr--;
                    }
                    break;
                case 1:
                    c++;
                    if (c < maxc) {
                        list.add(matrix[r][c]);
                    }
                    else {
                        direction = south;
                        maxc--;
                    }
                    break;
                case 0:
                    r--;
                    if (r > minr) {
                        list.add(matrix[r][c]);
                    }
                    else {
                        direction = east;
                        minr++;
                        r = minr;
                    }
                    break;
                case 3:
                    c--;
                    if (c > minc) {
                        list.add(matrix[r][c]);
                    }
                    else {
                        direction = north;
                        minc++;
                        c = minc;
                    }
                    break;
            }
        }
        return list;
    }
}
Unfortunatly this solution got TLE with some attempts at omptimization... I wonder what part of the while loop I am messing up... Thank you ManojKumarPatnaik for the solution below :>
*/
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int nrow = matrix.length;
        int ncol = matrix[0].length;
        int l_wall = -1, r_wall = ncol, u_wall = 0, d_wall = nrow;
        char direction = 'r';
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while(result.size() < nrow * ncol) {
            result.add(matrix[i][j]);
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