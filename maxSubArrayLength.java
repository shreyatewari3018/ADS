import java.util.HashMap;

public class maxSubArrayLength {
    public static void main(String[] args) {
        int[] nums = {1, -1, 5, -2, 3};
        int target = 3;
        System.out.println(maxSubArrayLength(nums, target));
    }

    public static int maxSubArrayLength(int[] nums, int target) {
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        int currentSum = 0;
        int maxLength = 0;

        // Initialize the sumMap with the base case (sum 0 at index -1)
        sumMap.put(0, -1); 

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            // Check if the current sum equals the target
            if (currentSum == target) {
                maxLength = i + 1; // This is a valid subarray from index 0 to i
            }

            // Check if (currentSum - target) exists in the map
            if (sumMap.containsKey(currentSum - target)) {
                maxLength = Math.max(maxLength, i - sumMap.get(currentSum - target));
            }

            // Only put the currentSum in the map if it's not already there (for the earliest occurrence)
            sumMap.putIfAbsent(currentSum, i);
        }

        return maxLength;
    }
}
