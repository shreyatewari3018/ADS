public class Leetcode2256 {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        
        // Step 1: Calculate the total sum of the array
        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        // Step 2: Initialize variables for prefix sum and minimum average difference
        long prefixSum = 0;
        long minAvgDiff = Long.MAX_VALUE;
        int minIndex = -1;
        
        // Step 3: Traverse the array and calculate the average difference for each index
        for (int i = 0; i < n; i++) {
            prefixSum += nums[i];  // Add the current element to the prefix sum
            
            // Average of the first (i + 1) elements
            long leftAvg = prefixSum / (i + 1);
            
            // Average of the remaining (n - i - 1) elements (if there are any)
            long rightAvg = 0;
            if (i < n - 1) {
                rightAvg = (totalSum - prefixSum) / (n - i - 1);
            }
            
            // Calculate the absolute difference
            long avgDiff = Math.abs(leftAvg - rightAvg);
            
            // Update the minimum average difference and index
            if (avgDiff < minAvgDiff) {
                minAvgDiff = avgDiff;
                minIndex = i;
            }
        }
        
        // Step 4: Return the index with the minimum average difference
        return minIndex;
    }
}
