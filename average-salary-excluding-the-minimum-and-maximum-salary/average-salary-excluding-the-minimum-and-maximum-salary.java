class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int val : salary) {
            if (val < min) {
                min = val;
            }
            if (val > max) {
                max = val;
            }
        }
        int total = 0;
        for (int val : salary) {
            if (val != min && val != max) { 
                total += val;
            }
        }
        return (double) total / (double) (salary.length-2);
    }
}