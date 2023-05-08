class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = (timeSeries.length*duration);
        int prev = 0;
        for (int i = 0; i < timeSeries.length; i++) {
            int time = timeSeries[i];
            if (i > 0 && (prev+duration) > time) {
                // we are working with a special instance, where we need to reset the cooldown
                // instead of resetting it, since we already caluclated the max possible poisons,
                // we are instead going to subtract the amount of poison that would have bled into the next 
                // time instance.
                // we can get this extra time by taking the previous time, adding duration, and subtracting time
                total -= (prev+duration-time);
            }

            prev = time;
        }
        return total;
    }
}