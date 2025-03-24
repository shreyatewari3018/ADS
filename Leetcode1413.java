public class Leetcode1413 {
    public int minStartValue(int[] nums) {
        int currentSum = 0;
        int minSum = 0;
        
        // Iterate through the array and compute the running sum
        for (int num : nums) {
            currentSum += num;
            minSum = Math.min(minSum, currentSum);
        }
        
        // If the minSum is less than 0, we need to increase the startValue
        return 1 - minSum > 0 ? 1 - minSum : 1;
    }
}
