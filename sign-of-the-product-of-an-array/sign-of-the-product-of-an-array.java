class Solution {
    public int arraySign(int[] nums) {
        int offset = 0;
        for (int num : nums) {
            if (num == 0) 
            { 
                return 0; 
            }
            else if (num < 0) 
            {
                offset++; 
            }
        }
        return ((offset % 2) == 0 ? 1 : -1);
    }
}