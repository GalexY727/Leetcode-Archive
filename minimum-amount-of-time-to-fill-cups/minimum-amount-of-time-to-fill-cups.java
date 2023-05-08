class Solution {
    public int fillCups(int[] amount) {
        int seconds = 0;
        while (amount[0] + amount[1] + amount[2] > 0) 
        {
            // int biggest = 2;
            // int lilguy = 1;
            // for (int i = 0; i < 3; i++) 
            // {
            //     if (amount[i] > amount[biggest]) {
            //         biggest = i;
            //     }
            //     if (amount[i] > amount[lilguy] ^ lilguy != biggest) {
            //         lilguy = i;
            //     }
            //     if (amount[biggest] > 0 && amount[lilguy] > 0) 
            //     {
            //         amount[biggest]--;
            //         amount[lilguy]--;
            //     }
            //     else 
            //     {
            //         amount[biggest]--;
            //     }
            // }

            Arrays.sort(amount);
            if (amount[2] > 0 && amount[1] > 0) 
            {
                amount[2]--;
                amount[1]--;
                // System.out.println(0);
            }
            else if (amount[1] > 0 && amount[2] > 0) 
            {
                amount[1]--;
                amount[2]--;
                // System.out.println(2);
            }
            else if (amount[0] > 0 && amount[2] > 0) 
            {
                amount[0]--;
                amount[2]--;
                // System.out.println(1);
            }
            else 
            {
                for (int i = 2; i >= 0; i--) 
                {
                    if (amount[i] > 0) {
                        amount[i]--;
                        // System.out.println(3);
                        break;
                    }
                }
            }
            seconds++;
        }
        return seconds;
    }
}