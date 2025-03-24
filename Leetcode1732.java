public class Leetcode1732 {
    public int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int maxAltitude = 0;
        
        // Iterate through the gain array to calculate altitudes
        for (int g : gain) {
            currentAltitude += g;  // Update the current altitude
            maxAltitude = Math.max(maxAltitude, currentAltitude);  // Track the highest altitude
        }
        
        return maxAltitude;
    }
}
