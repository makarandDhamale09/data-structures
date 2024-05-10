package leetCodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * NOTE : LeetCode Question 15 (Medium) Given an integer array nums, return all the triplets
 * [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k]
 * == 0.
 *
 * <p>Notice that the solution set must not contain duplicate triplets.
 *
 * <p>Input: nums = [-1,0,1,2,-1,-4] Output: [[-1,-1,2],[-1,0,1]] Explanation: nums[0] + nums[1] +
 * nums[2] = (-1) + 0 + 1 = 0. nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0. nums[0] + nums[3] +
 * nums[4] = (-1) + 2 + (-1) = 0. The distinct triplets are [-1,0,1] and [-1,-1,2]. Notice that the
 * order of the output and the order of the triplets does not matter.
 */
public class ThreeSum {
  public static void main(String[] args) {
    Integer[] nums = {0, 0, 0, 0};
    List<List<Integer>> list = threeSum(nums);
    list.forEach(System.out::println);
  }

  public static List<List<Integer>> threeSum(Integer[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> arr = new ArrayList<>();
    int l;
    int r;
    for (int i = 0; i < nums.length; i++) {
      if (i > 0 && (nums[i] == nums[i - 1])) {
        continue;
      }
      l = i + 1;
      r = nums.length - 1;
      while (l < r) {
        int threeSum = nums[l] + nums[r] + nums[i];
        if (threeSum > 0) {
          r--;
        } else if (threeSum < 0) {
          l++;
        } else {
          arr.add(Arrays.asList(nums[i], nums[l], nums[r]));
          l++;
          while (nums[l] == nums[l - 1]) {
            l = +1;
          }
        }
      }
    }
    return arr;
  }
}
