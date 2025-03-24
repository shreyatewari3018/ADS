public class Leetcode1685 {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // Step 1: Compute the total sum of nums
        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        // Step 2: Compute result array
        long leftSum = 0;
        for (int i = 0; i < n; i++) {
            // Right sum is totalSum - leftSum - nums[i]
            long rightSum = totalSum - leftSum - nums[i];
            
            // The result for index i is the difference from the left and right sides
            result[i] = (int) (nums[i] * i - leftSum + rightSum - nums[i] * (n - i - 1));
            
            // Update leftSum for the next iteration
            leftSum += nums[i];
        }
        
        return result;
    }
}
