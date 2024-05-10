package leetCodeQuestions;

/**
 * Given an integer array nums, find the subarray with the largest sum, and return its sum
 *
 * <p>Input: nums = [-2,1,-3,4,-1,2,1,-5,4] Output: 6 Explanation: The subarray [4,-1,2,1] has the
 * largest sum 6.
 */
public class MaximumSubArray {
  public static void main(String[] args) {
    int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int result = maxSubArray(nums);
    System.out.println(result);
  }

  public static int maxSubArray(int[] nums) {
    int maxSum = nums[0];
    int sum = 0;
    for (int i : nums) {
      if (sum < 0) {
        sum = 0;
      }
      sum = sum + i;
      maxSum = Math.max(sum, maxSum);
    }
    return maxSum;
  }
}
