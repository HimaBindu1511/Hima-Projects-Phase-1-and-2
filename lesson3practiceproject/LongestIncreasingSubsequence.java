package lesson3practiceproject;

public class LongestIncreasingSubsequence {
    public static int findLongestIncreasingSubsequence(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            dp[i] = 1; // Initialize each element to a minimum subsequence length of 1

            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    // Update the subsequence length at index i if a longer subsequence is found
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            maxLen = Math.max(maxLen, dp[i]); // Update the maximum subsequence length
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        int longestIncreasingSubsequenceLength = findLongestIncreasingSubsequence(nums);
        System.out.println("Length of the longest increasing subsequence: " + longestIncreasingSubsequenceLength);
    }
}