public class Leetcode167 {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
                int r = numbers.length - 1;
                while (l < r) {
                    int sum = numbers[l] + numbers[r];
                    if (sum == target) {
                        // Return 1-based indices by adding 1 to l and r
                        return new int[]{l + 1, r + 1};
                    } else if (sum < target) {
                        l++;
                    } else {
                        r--;
                    }
                }
                return new int[]{};
            }
}
