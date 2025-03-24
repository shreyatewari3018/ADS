public class Leetcode303 {
    private int[] prefixSum;

    // Constructor that initializes the prefixSum array
    public NumArray(int[] nums) {
        // Initialize the prefixSum array with length nums.length + 1
        prefixSum = new int[nums.length + 1];
        
        // Build the prefix sum array
        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
    }

    // Method to return the sum of elements from index 'left' to 'right' (inclusive)
    public int sumRange(int left, int right) {
        return prefixSum[right + 1] - prefixSum[left];
    }
}
